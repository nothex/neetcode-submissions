class Solution {
    public int maxArea(int[] heights) {
        int res=0,len=heights.length-1;
        for(int i=0,r=len;i<heights.length && r>=0;){
            if(heights[i]<heights[r]){
                res=Math.max(res,heights[i]*len);
                i++;
            }
            else{
                res=Math.max(res,heights[r]*len);
                r--;
            }
            len--;
        }
        return res;
    }
}
