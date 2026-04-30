class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int i = 0;
        return Math.min(dp(cost,i),dp(cost,i+1));
    }
    public static int dp(int cost[],int i){
        if(i == cost.length - 1) return cost[i];
        if(i == cost.length - 2) return cost[i];
        return cost[i]+Math.min(dp(cost,i+1),dp(cost,i+2));
        
    }
}
