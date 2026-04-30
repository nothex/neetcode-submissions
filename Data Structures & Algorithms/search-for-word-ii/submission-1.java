class Solution {
    public class Trienode{
        Trienode []children=new Trienode[26];
        String word=null;
    }
    public Trienode buildTre(String []words){
        Trienode root=new Trienode();
        for(String word:words){
            Trienode node=root;
            for(char c:word.toCharArray()){
                int i=c-'a';
                if(node.children[i]==null) node.children[i]=new Trienode();
                node=node.children[i];
            }
            node.word=word;
        }
        return root;
    }
    public static void dfs(char board[][],int i,int j,Trienode node,List<String> res){
        char c=board[i][j];
        if(c=='#' || node.children[c-'a'] == null) return;
        node=node.children[c-'a'];
        if(node.word!=null){
            res.add(node.word);
            node.word=null;
        }
        board[i][j] = '#';
        if(i>0) dfs(board,i-1,j,node,res) ;
        if(j>0) dfs(board,i,j-1,node,res) ;
        if(i<board.length-1) dfs(board,i+1,j,node,res) ;
        if(j<board[0].length-1) dfs(board,i,j+1,node,res) ;
        board[i][j]=c;
    }
    public List<String> findWords(char[][] board, String[] words) {
        Trienode root=buildTre(words);
        List<String> res=new ArrayList<>();
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                dfs(board,i,j,root,res);
            }
        }
        return res;
    }
}
