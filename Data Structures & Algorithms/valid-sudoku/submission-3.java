class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> set=new HashSet<>();
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                char c=board[i][j];
                if(c=='.') continue;
                String rowk=i+"is row"+c;
                String colk=j+"is col"+c;
                String diagk=(i/3)+"-"+(j/3)+"is dia"+c;
                if(!set.add(rowk)||!set.add(colk)||!set.add(diagk)) return false;
            }
        }
        return true;
    }
}
