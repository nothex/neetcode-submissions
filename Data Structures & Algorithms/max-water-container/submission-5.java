class Solution {
    public int maxArea(int[] heights) {
        int area=0;
        int i=0,j=heights.length-1;
        int len=j;
        while(i<j){
            if(heights[i]<heights[j]){
                area=Math.max(area,heights[i]*len);
                i++;
            }
            else{
                area=Math.max(area,heights[j]*len);
                j--;
            }
            len--;
        }
        return area;
    }
}
