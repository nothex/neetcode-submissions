class Solution {
    public int trap(int[] height) {
        if (height == null || height.length < 3) return 0;
        int maxLeft=height[0],maxRight=height[height.length-1];
        int l=1,r=height.length-2,res=0;
        while(l<=r){
            if(maxLeft<=maxRight){
                maxLeft=Math.max(maxLeft,height[l]);
                res+=maxLeft-height[l];
                l++;
            }
            else {
                maxRight=Math.max(maxRight,height[r]);
                res+=maxRight-height[r];
                r--;
            }
        }
        return res;
    }
}
