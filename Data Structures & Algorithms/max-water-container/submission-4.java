class Solution {
    public int maxArea(int[] heights) {
        int len=heights.length-1,l=0,r=heights.length-1,res=0;
        while(l<r){
            if(heights[l]<heights[r]){
                res=Math.max(res,heights[l]*len);
                l++;
            }
            else {
                res=Math.max(res,heights[r]*len);
                r--;
            }
            len--;
        }
        return res;
    }
}
