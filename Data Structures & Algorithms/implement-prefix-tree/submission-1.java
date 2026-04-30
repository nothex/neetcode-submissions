class PrefixTree {
    
    PrefixTree children[];
    boolean end;
    PrefixTree root;

    public PrefixTree() {
         children=new PrefixTree[26];
         end=false;
    }
    public void initRoot(){
        if(root==null) root=new PrefixTree();
    }

    public void insert(String word) {
        if(root==null) root=new PrefixTree();
         PrefixTree node=root;
         for(char c:word.toCharArray()){
            int idx=c-'a';
            if(node.children[idx]==null)
            node.children[idx]=new PrefixTree();
            node=node.children[idx];
         }
         node.end=true;
    }

    public boolean search(String word) {
        if(root==null) root=new PrefixTree();
         PrefixTree node=root;
         for(char c:word.toCharArray()){
            int idx=c-'a';
            if(node.children[idx]==null)
            return false;
            node=node.children[idx];
         }
         return node.end;
    }

    public boolean startsWith(String prefix) {
        if(root==null) root=new PrefixTree();
         PrefixTree node=root;
         for(char c:prefix.toCharArray()){
            int idx=c-'a';
            if(node.children[idx]==null)
            return false;
            node=node.children[idx];
         }
         return true;
    }
}
