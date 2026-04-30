class Solution {
    public int findMin(int[] nums) {
        int i=0,j=nums.length-1;
        while(i<j){
            int mid=(j-i)/2+i;
            if(nums[mid]>nums[j]) i=mid+1;
            else j=mid;
        }
        return nums[j];
    }
}
