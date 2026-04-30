class Solution {
    public int findMin(int[] nums) {
        int l=0,h=nums.length-1;
        for(;l<h;){
            int mid=(h-l)/2+l;
            if(nums[mid]>nums[h]) l=mid+1;
            else h=mid;
        }
        return nums[h];
    }
}
