class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();
        char [][]board=new char[n][n];
        for(char row[]:board){
            Arrays.fill(row,'.');
        }
        backtrack(0,n,board,result);
        return result; 
    }
    public static void backtrack(int row,int n,char [][]board,List<List<String>> result){
        if(row == n){
            result.add((construct(board)));
            return;
        }
        for(int col=0;col<n;col++){
            if(isSafe(row,col,board,n)){
                board[row][col]='Q';
                backtrack(row+1,n,board,result);
                board[row][col]='.';
            }
        }
    }
    public static boolean isSafe(int row,int col,char [][]board,int n){
        for(int i=0;i<row;i++){
            if(board[i][col]=='Q') return false;
        }
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(board[i][j]=='Q') return false;
        }
        for(int i=row-1,j=col+1;i>=0 && j<n;i--,j++){
            if(board[i][j]=='Q') return false;
        }
        return true;
    }
    public static List<String> construct(char board[][]){
        List<String> current=new ArrayList<>();
        for(char row[]:board){
            current.add(new String(row));
        }
        return current;
    }
}
