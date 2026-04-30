class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashMap<String,Character> map=new HashMap<>();
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                char c=board[i][j];
                if(c=='.') continue;
                
                String rowk=c+"rk"+i;                
                String colk=c+"ck"+j;                
                String diak=c+"diak"+i/3+"-"+j/3;
                if(map.containsKey(rowk) || map.containsKey(colk) || map.containsKey(diak)) return false;
                if(!map.containsKey(rowk)) map.put(rowk,c);
                if(!map.containsKey(colk)) map.put(colk,c);
                if(!map.containsKey(diak)) map.put(diak,c);
                
                               
            }
        }
        return true;
    }
}
