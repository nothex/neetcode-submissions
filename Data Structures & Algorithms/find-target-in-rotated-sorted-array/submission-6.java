class Solution {
    public int search(int[] nums, int target) {
        int l=0,h=nums.length-1,pivot=0;
        for(;l<h;){
            int mid=(h-l)/2+l;
            if(nums[mid]>nums[h]) l=mid+1;
            else h=mid;
        }
        pivot=h;
        int ans1=search(nums,0,pivot-1,target);
        int ans2=search(nums,pivot,nums.length-1,target);
        if(ans1==ans2) return -1;
        else if(ans1==-1) return ans2;
        else return ans1;
    }
    public static int search(int []nums,int l,int h,int target){
        for(;l<=h;){
            int mid=(h-l)/2+l;
            if(nums[mid]==target) return mid;
            if(nums[mid]<target) l=mid+1;
            else h=mid-1;
        }
        return -1;
    }
}
