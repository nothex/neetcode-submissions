class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int res[]=new int[nums.length+1-k];
        int idx=0,best=0;
        if(k==1) return nums;
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<i+k;j++){
                if(i+k<=nums.length && nums[j]>best) best=nums[j];
            }
            if(idx<nums.length+1-k) res[idx++]=best;
            best=0;
        }
        return res;
    }
}
