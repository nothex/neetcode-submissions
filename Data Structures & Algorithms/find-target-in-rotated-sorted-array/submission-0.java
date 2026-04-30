class Solution {
    public int search(int[] nums, int target) {
    int l=0,h=nums.length-1;
    while(l<h){
        int mid=l+(h-l)/2;
        if(nums[mid]>nums[h]) l=mid+1;
        else h=mid;
    }
    int pivot=h;
    int sol1=binarySearch(nums,0,pivot-1,target);
    int sol2=binarySearch(nums,pivot,nums.length-1,target);
    if(sol1==sol2) return -1;
    else if(sol1==-1) return sol2;
    else return sol1;
    }
    public int binarySearch(int []nums,int start,int end,int target){
    int l=start,h=end;
    while(l<=h){
        int mid=l+(h-l)/2;
        if(nums[mid]==target) return mid;
        else if(nums[mid]<target) l=mid+1;
        else h=mid-1;
    }
    return -1;
    }
}
