class Solution {
    public int[] productExceptSelf(int[] nums) {
        int pre=1,pos=1;
        int []res = new int [nums.length];
        Arrays.fill(res,1);
        for(int i=1;i<nums.length;i++)
        {
          pre*=nums[i-1];
          res[i]*=pre;
        }
        for(int j=nums.length-1;j>=0;j--){
            res[j]*=pos;
            pos*=nums[j];
        }
        return res;
    }
}  
