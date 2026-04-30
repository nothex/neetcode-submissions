class WordDictionary {
    
    WordDictionary []children;
    WordDictionary root;
    boolean end;

public WordDictionary() {
      
    children=new WordDictionary[26];
    end=false;

}

public void initRoot(){
  if(root==null) root=new WordDictionary();
}

public void addWord(String word) {
    if(root==null) initRoot();
    WordDictionary node=root;
    for(char c:word.toCharArray()){
        int idx=c-'a';
        if(node.children[idx]==null){
            node.children[idx]=new WordDictionary();
        }
        node=node.children[idx];
    }
    node.end=true;
}

public boolean search(String word) {
    if(root==null) initRoot();
    return searchHelper(word,0,root);    
    }
public boolean searchHelper(String word,int pos,WordDictionary node){
    if(pos==word.length()) return node.end;
    char c=word.charAt(pos);
    
    if(c=='.'){
        for(int i=0;i<26;i++){
            if(node.children[i]!=null && searchHelper(word,pos+1,node.children[i]))
            return true;
        }
        return false;
    }
    else {
        int idx=c-'a';
        if(node.children[idx]==null) return false;
        return searchHelper(word,pos+1,node.children[idx]);
    }
}
}
