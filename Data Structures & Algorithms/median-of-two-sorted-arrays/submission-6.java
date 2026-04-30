class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(nums1.length>nums2.length) return findMedianSortedArrays(nums2,nums1);
        int x=nums1.length,y=nums2.length,start=0,end=nums1.length;

        while(start<=end){
            int mid1=(end-start)/2+start;
            int mid2=(x+y+1)/2-mid1;
            
            int l1=(mid1==0)?Integer.MIN_VALUE:nums1[mid1-1];
            int r1=(mid1==x)?Integer.MAX_VALUE:nums1[mid1];
            int l2=(mid2==0)?Integer.MIN_VALUE:nums2[mid2-1];
            int r2=(mid2==y)?Integer.MAX_VALUE:nums2[mid2];

            if(l1<=r2 && l2<=r1){
                if((x+y)%2 ==0) return (double)(Math.max(l1,l2)+Math.min(r1,r2))/2;
                else return Math.max(l1,l2);
            }
            else if(l1>r2) end=mid1-1;
            else start=mid1+1;
        }
        return -1;
    }
}
