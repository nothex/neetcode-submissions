class Solution {
    public int climbStairs(int n) {
        int [] mem = new int [n+1];
        return dp(n,mem);
    }
    public static int dp(int n,int []mem){
        if(mem[n] == 0){
        if(n == 1) {
            mem[n] = 1;
            return mem[n];
        }
        if(n == 2){
            mem[n] = 2;
            return mem[n];
        }
        mem[n] = dp(n-1,mem)+dp(n-2,mem);
    }
    return mem[n];
}
}
