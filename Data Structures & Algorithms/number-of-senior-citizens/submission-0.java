class Solution {
    public int countSeniors(String[] details) {
        
        int count=0;
        for(String detail:details){
            int i=11,j=detail.length()-2;
            if(Integer.parseInt(detail.substring(i,j))>60) count++;
        }
        return count;
    }
}