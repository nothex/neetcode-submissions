class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> set=new HashSet<>();
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                char c=board[i][j];
                if(c == '.') continue;
                String rowk=i+" rowk "+c;
                String colk=j+" colk "+c;
                String boxk=i/3+" - "+j/3+" boxk "+c;
                if(set.contains(rowk) || set.contains(colk) ||set.contains(boxk)) return false;
                set.add(rowk);
                set.add(colk);
                set.add(boxk);
            }
        }
            return true;
    }
}
