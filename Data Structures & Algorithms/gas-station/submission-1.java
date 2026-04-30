class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        if(sum(gas)>=sum(cost)){
        int total=0,start=0;
        for(int i=0;i<gas.length;i++){
            total+=gas[i]-cost[i];
            if(total<0) 
            {total=0;
             start=i+1;
            }
        }
        return start;
        }
        return -1;
    }
    public static int sum(int []arr){
        int s=0;
        for(int n:arr){
            s+=n;
        }
        return s;
    }
}
