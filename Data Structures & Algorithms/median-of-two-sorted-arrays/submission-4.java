class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double []merge=new double [nums1.length+nums2.length];
        int i=0,j=0,index=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<=nums2[j] ) {
                merge[index]=nums1[i];
                i++;
            }
            else if(nums1[i]>nums2[j]) {
                merge[index]=nums2[j];
                j++;
            }
            index++;
        }
        while(i<nums1.length){
            merge[index]=nums1[i];
            index++;
            i++;
        }
        while(j<nums2.length){
            merge[index]=nums2[j];
            index++;
            j++;
        }
        
        int mid=nums1.length+nums2.length;
        if(mid %2 == 1) return merge[mid/2];
        else return (merge[mid/2]+merge[mid/2-1])/2;
    }
}
