class Solution {
    public boolean isValidSudoku(char[][] board) {
    HashSet<String> seen =new HashSet<>();
    for(int i=0;i<9;i++){
        for(int j=0;j<9;j++){

            char num=board[i][j];

            if(num=='.')
            continue;

            String rowk=num+" is row " + i;
            String colk=num+" is col " + j;
            String boxk=num+" is row " + (i/3) + "-" + j/3;

            if(!seen.add(rowk)||!seen.add(colk)||!seen.add(boxk))
            return false;
        }
    }
    return true;
    }
}
