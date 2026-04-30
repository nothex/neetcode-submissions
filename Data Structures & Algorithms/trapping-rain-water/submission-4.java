class Solution {
    public int trap(int[] height) {
       int l=0,r=height.length-1,maxleft=height[l],maxright=height[r],res=0;
       while(l<r){
        if(maxleft<=maxright){
            l++;
            maxleft=Math.max(maxleft,height[l]);
            res+=maxleft-height[l];
        }
        else{
            r--;
            maxright=Math.max(maxright,height[r]);
            res+=maxright-height[r];
        }
       }
       return res;
}
}