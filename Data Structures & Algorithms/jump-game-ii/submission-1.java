class Solution {
    public int jump(int[] nums) {
        int res=0;
        int i=0,j=0;
        int farthest=0;
        while(i<nums.length-1){
            farthest=Math.max(farthest,i+nums[i]);
            if(i==j)
            {
            j=farthest;
            res++;
            }
            i++;
        }
        return res;
    }
}
