class Solution {
    public int trap(int[] height) {
        int left=height[0],right=height[height.length-1],l=1,r=height.length-2,res=0;
        for(;l<=r;){
            if(left<=right){
                left=Math.max(left,height[l]);
                res+=left-height[l];
                l++;
            }
            else {
                right=Math.max(right,height[r]);
                res+=right-height[r];
                r--;
            }
        }
        return res;
    }
}
