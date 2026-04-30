class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum=Integer.MIN_VALUE;
        int curr=0;
        for(int n:nums){
            curr+=n;
            maxSum=Math.max(maxSum,curr);
            if(curr<0) curr=0;
        }
        return maxSum;
    }
}
