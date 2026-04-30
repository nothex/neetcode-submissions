class Solution {
    private static class Pair{
        int index;
        int height;
        Pair(int index,int height){
            this.index=index;
            this.height=height;
        }
    }
    public int largestRectangleArea(int[] heights) {
       Stack<Pair> tab=new Stack<>();
       int maxArea=0;
       for(int i=0;i<heights.length;i++){
        while(!tab.isEmpty() && heights[i]<tab.peek().height){
           int heig=tab.pop().height;
           int width=tab.isEmpty()?i:i-tab.peek().index-1;
           maxArea=Math.max(maxArea,width*heig);
        }
        tab.push(new Pair(i,heights[i]));
       }
      while(!tab.isEmpty()){
           int heig=tab.pop().height;
           int width=tab.isEmpty()?heights.length:heights.length-tab.peek().index-1;
           maxArea=Math.max(maxArea,width*heig);
        }
       return maxArea;
    }
}
