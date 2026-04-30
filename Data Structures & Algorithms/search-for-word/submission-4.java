class Solution {
    public boolean exist(char[][] board, String word) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(backtrack(0,board,i,j,word)) return true; 
                }
        }
        return false;
    }
    public static boolean backtrack(int index,char [][]board,int i,int j,String word){
        if(index == word.length()) return true;
        if(i < 0 || i >= board.length || j < 0 || j >= board[0].length || word.charAt(index)!=board[i][j]) return false;
        char c=board[i][j];
        board[i][j] = '#';
        boolean res =backtrack(index+1,board,i-1,j,word) || backtrack(index+1,board,i+1,j,word) || backtrack(index+1,board,i,j-1,word) || backtrack(index+1,board,i,j+1,word);
        board[i][j] = c ;
        return res;
    }

}
