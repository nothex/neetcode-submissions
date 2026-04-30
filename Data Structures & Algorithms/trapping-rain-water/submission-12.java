class Solution {
    public int trap(int[] height) {
        int maxleft=height[0],maxright=height[height.length-1],res=0,i=1,j=height.length-2;
        while(i<=j){
            if(maxleft<=maxright){
                maxleft=Math.max(maxleft,height[i]);
                res+=maxleft-height[i];
                i++;
            }
            else{
                maxright=Math.max(maxright,height[j]);
                res+=maxright-height[j];
                j--;
            }
        }
        return res;
    }
}
