class Solution {
    public int maxArea(int[] heights) {
       int len=heights.length-1;
       int i=0,j=len;
       int maxArea=0;
       while(i<j){
        maxArea=Math.max(Math.min(heights[i],heights[j])*len,maxArea);
        if(heights[i]<heights[j]) i++;
        else j--;
        len--;
        }
       return maxArea;

    }
}
