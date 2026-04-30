class Solution {
    public int jump(int[] nums) {
        int r=0,farthest=0,res=0;
        for(int l=0;l<nums.length-1;l++){
            farthest=Math.max(farthest,l+nums[l]);
            if(l==r){
                res++;
                r=farthest;
            }
        }
        return res;
    }
}
