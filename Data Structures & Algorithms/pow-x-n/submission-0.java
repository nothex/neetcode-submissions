class Solution {
    public double myPow(double x, int n) {
        long N=n;
        double ans=1.0;
        if(n<0) {
            N*=-1;
            x=1.0/x;
        }
        while(N!=0){
            if(N%2==0){
                x*=x;
                N/=2;
            }
            else {
                ans*=x;
                N-=1;
            }
        }
            return ans;
        }
    }

