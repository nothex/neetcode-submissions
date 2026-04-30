class Solution {
    public int maxArea(int[] heights) {
        int area=0,i=0,j=heights.length-1;
        
        while(i<j){
            if(heights[i]<=heights[j]) 
            {area=Math.max(heights[i]*(j-i),area);
            i++;}
            else {
            area=Math.max(heights[j]*(j-i),area);
            j--;
            }
        }
        return area;
    }
}
