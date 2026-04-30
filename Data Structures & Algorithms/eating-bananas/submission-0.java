class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low=1,high=0;
        for(int n:piles)
        {
            if(n>high)
              high=n;
        }
        int k=Integer.MAX_VALUE;
        while(low<=high){
            int mid=low+(high-low)/2;

            if(checker(piles,mid)<=h){
            k=Math.min(k,mid);
            high=mid-1;}
            else low=mid+1;
        }
        return k;
    }
    public int checker(int[]piles,int k){
    int sum=0;
    for(int n:piles){
        sum=sum+(n-1)/k+1;
    }
    return sum;
    }
}
