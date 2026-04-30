class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(nums1.length>nums2.length) return findMedianSortedArrays(nums2,nums1);
        
        int x=nums1.length; 
        int y=nums2.length;
        int start=0,end=x;
        while(start<=end){
            int mid=start+(end-start)/2;
            int partitionX=mid;
            int partitionY=(x+y+1)/2-partitionX;

            int maxLeftx=(partitionX==0)?Integer.MIN_VALUE:nums1[partitionX-1];
            int minRightx=(partitionX==x)?Integer.MAX_VALUE:nums1[partitionX];

            int maxLefty=(partitionY==0)?Integer.MIN_VALUE:nums2[partitionY-1];
            int minRighty=(partitionY==y)?Integer.MAX_VALUE:nums2[partitionY];

            if(maxLeftx<=minRighty && maxLefty<=minRightx){
                if((x+y)%2==0) return (double)(Math.min(minRightx,minRighty)+Math.max(maxLeftx,maxLefty))/2;
                else return Math.max(maxLeftx,maxLefty);
            }
            else if(maxLeftx>minRighty) end=mid-1;
            else start=mid+1;
        } return 0.0;
        }
}
