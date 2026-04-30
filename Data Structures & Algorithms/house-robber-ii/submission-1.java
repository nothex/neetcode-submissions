class Solution {
    public int rob(int[] nums) {
        int i = 0;
        int end = nums.length-1;
        if(nums.length == 1) return nums[0];
        if(nums.length == 0) return 0;
        return Math.max(dp(nums,i,end-1,new Integer[nums.length]),dp(nums,i+1,end,new Integer[nums.length]));
    }
    public static int dp(int []nums,int i,int end,Integer memo[]){
        if(i == end) return nums[i];
        if(i == end - 1) return Math.max(nums[i],nums[i+1]);
        if(memo[i]!=null) return memo[i];
        memo[i]=Math.max(dp(nums,i+1,end,memo),nums[i]+dp(nums,i+2,end,memo));
        return memo[i];
    }
}
