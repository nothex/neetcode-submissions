class Solution {
    public int trap(int[] height) {
        int left=height[0],right=height[height.length-1],res=0;
        for(int l=0,r=height.length-1;l<r;){
            if(left<=right){
                l++;
                left=Math.max(left,height[l]);
                res+=left-height[l];
            }
            else{
                r--;
                right=Math.max(right,height[r]);
                res+=right-height[r];
            }
        }
        return res;
    }
}
