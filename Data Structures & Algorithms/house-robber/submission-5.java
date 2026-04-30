class Solution {
    public int rob(int[] nums) {
        int i=nums.length;
        Integer mem[] = new Integer[i];
        return dp(nums,mem,i-1);
    }
    public static int dp(int[] nums,Integer[] mem,int i){
        if(i == 0) return nums[0];
        if(i == 1) return Math.max(nums[0],nums[1]);
        if(mem[i]!=null) return mem[i];
        mem[i]=Math.max(dp(nums,mem,i-1),dp(nums,mem,i-2)+nums[i]);
        return mem[i];
    }
}
