class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int s=1,e=0;
        for(int n:piles){
            e=Math.max(n,e);
        }
        while(s<e){
            int mid=(e-s)/2+s;
            if(helper(piles,mid,h)) e=mid;
            else s=mid+1;
        }
        return s;
    }
    public static boolean helper(int[]piles,int speed,int h){
        int hours=0;
        for(int pile:piles){
            hours+=Math.ceil((double)pile/speed);
        }
        return hours<=h;
    }
}
