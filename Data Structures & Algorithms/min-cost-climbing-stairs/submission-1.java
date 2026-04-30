class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        Integer memo[]=new Integer[cost.length];
        return Math.min(dp(cost,n-1,memo),dp(cost,n-2,memo));
    }
    public static int dp(int []cost,int i,Integer memo[]){
        if(i == 0) return cost[0];
        if(i == 1) return cost[1];
        if(memo[i]!=null) return memo[i];
        memo[i]=cost[i]+Math.min(dp(cost,i-1,memo),dp(cost,i-2,memo));
        
        return memo[i];
    }
}
