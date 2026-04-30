class Solution {
    public int rob(int[] nums) {
        int i = 0;
        Integer memo[]=new Integer[nums.length];
        return dp(nums,i,memo);
    }
    public static int dp(int []nums,int i,Integer memo[]){
        if(i == nums.length-1) return nums[i];
        if(i == nums.length-2) return Math.max(nums[i],nums[i+1]);
        if(memo[i]!=null) return memo[i];
        memo[i]=Math.max(dp(nums,i+1,memo),nums[i]+dp(nums,i+2,memo));
        return memo[i];
    }
}
