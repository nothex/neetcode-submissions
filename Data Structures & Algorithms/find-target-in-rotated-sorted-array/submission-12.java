class Solution {
    public int search(int[] nums, int target) {
        int i=0,j=nums.length-1;
        while(i<j){
            int mid=(j-i)/2+i;
            if(nums[mid]>nums[j]) i=mid+1;
            else j=mid;
        }
        int pivot=j;
        int res1=binarysearch(nums,0,pivot-1,target);
        int res2=binarysearch(nums,pivot,nums.length-1,target);
        if(res1==res2) return-1;
        else if(res1==-1) return res2;
        else return res1;
    }
    public int binarysearch(int[]nums,int s,int e,int target){
        while(s<=e){
        int mid=(e-s)/2+s;
        if(nums[mid]==target) return mid;
        else if(nums[mid]<target) s=mid+1;
        else e=mid-1;
    }
    return -1;
    }
}
