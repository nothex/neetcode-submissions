class Solution {
    public int maxArea(int[] heights) {
        int st=0,en=heights.length-1,l=heights.length-1;
        int area=-1,are=1;
        for(int i=0;i<heights.length;i++){
           if(heights[st]<heights[en])
             {
                are=l*heights[st];
                l--;
                area=Math.max(area,are);
                st++;
             }
             else{
                are=l*heights[en];
                l--;
                area=Math.max(area,are);
                en--;
             }
        }
        return area;

    }
}
