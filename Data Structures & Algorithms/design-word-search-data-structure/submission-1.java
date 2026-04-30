class WordDictionary {
    WordDictionary []children;
    boolean present;
    public WordDictionary() {
        children=new WordDictionary[26];
        present=false;
    }

    public void addWord(String word) {
        WordDictionary root =this;
        for(char c:word.toCharArray()){
            if(root.children[c-'a']==null) root.children[c-'a']=new WordDictionary();
            root=root.children[c-'a'];
        }
        root.present=true;
    }

    public boolean search(String word) {
        return search(word,0);
    }
    public boolean search(String word,int index){
        WordDictionary root =this;
        if(index == word.length()) return present;
        char c = word.charAt(index);
        if(c == '.'){
            for(WordDictionary child:children)
                if(child!=null && child.search(word,index+1)) return true;
                return false;
        }
        else {
            if(root.children[c-'a']==null) return false;
            return root.children[c-'a'].search(word,index+1);
        }
}
}
