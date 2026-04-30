class Solution {
    public int[] productExceptSelf(int[] nums) {
        int pre=1,pos=1;
        int res[]=new int[nums.length];
        Arrays.fill(res,1);
        for(int i=1;i<nums.length;i++){
            pre=pre*nums[i-1];
            res[i]=res[i]*pre;
        }
        for(int i=nums.length-1;i>=0;i--){
            res[i]=res[i]*pos;
            pos=nums[i]*pos;
        }
        return res;
    }
}  
