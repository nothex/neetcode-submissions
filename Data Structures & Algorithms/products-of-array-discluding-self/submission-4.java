class Solution {
    public int[] productExceptSelf(int[] nums) {
        int pre=1,pos=1;
        int res[]=new int[nums.length];
        Arrays.fill(res,1);
        for(int i=0;i<nums.length;i++){
            res[i]=res[i]*pre;
            pre=nums[i]*pre;
        }
        for(int i=nums.length-1;i>=0;i--){
            res[i]=res[i]*pos;
            pos=nums[i]*pos;
        }
        return res;
    }
}  
