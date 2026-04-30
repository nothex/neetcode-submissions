class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> set=new HashSet<>();
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                char c=board[i][j];
                if(c == '.') continue;
                String rowk=c+"is rowk"+i;
                String colk=c+"is colk"+j;
                String boxk=c+"is boxk"+i/3+" - "+ j/3;
                if(!set.add(rowk) || !set.add(colk) || !set.add(boxk)) return false;
            }
        }
        return true;
    }
}
