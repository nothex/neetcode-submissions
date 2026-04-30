class Solution {
    class TrieNode{
        TrieNode []children=new TrieNode[26];
        String word = null;
    }
    
    public  TrieNode buildTre(String []words){
        TrieNode root=new TrieNode();
        for(String word:words){
            TrieNode curr=root;
            for(char c:word.toCharArray()){
                int i=c-'a';
                if(curr.children[i]==null) curr.children[i]=new TrieNode();
                curr = curr.children[i];
            }
            curr.word=word;
        }
        return root;
    }
    public static void dfs(char[][] board,int i,int j,TrieNode node,List<String> result){
        char c=board[i][j];
        if(c == '#' || node.children[c-'a'] == null) return ;
        node = node.children[c-'a'];
        if(node.word!=null){
            result.add(node.word);
            node.word=null;
        }
        board[i][j]='#';
        if(i>0) dfs(board,i-1,j,node,result);//up
        if(j>0) dfs(board,i,j-1,node,result);//left
        if(i<board.length-1) dfs(board,i+1,j,node,result);//down
        if(j<board[0].length-1) dfs(board,i,j+1,node,result);//right
        board[i][j]=c;
    }

    public List<String> findWords(char[][] board, String[] words) {
        List<String> result =new ArrayList<>();
        TrieNode root=buildTre(words);

        for (int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                dfs(board,i,j,root,result);
            }
        }
        return result;
    }
}
 