class Solution {
    public int trap(int[] height) {
        int i=0,j=height.length-1;
        int maxL=height[i],maxR=height[j];
        int res=0;
        while(i<j){
            if(height[i]<=height[j]){
                maxL=Math.max(maxL,height[i]);
                res+=maxL-height[i];
                i++;
            }
            else {
                maxR=Math.max(maxR,height[j]);
                res+=maxR-height[j];
                j--;
            }
        }
        return res;
    }
}
