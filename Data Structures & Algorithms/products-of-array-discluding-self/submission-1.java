class Solution {
    public int[] productExceptSelf(int[] nums) {
    int pre=1,pos=1;
    int result[]=new int[nums.length];
    Arrays.fill(result,1);
    for(int i=1;i<nums.length;i++){
        pre*=nums[i-1];
        result[i]*=pre;
    }
    for(int i=nums.length-1;i>=0;i--){
        result[i]*=pos;
        pos*=nums[i];
    }
    return result;
}  
}
