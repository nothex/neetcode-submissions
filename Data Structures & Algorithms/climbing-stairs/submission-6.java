class Solution {
    public int climbStairs(int n) {
        int i = 0;
        Integer mem[] = new Integer[n];
        return dp(n,i,mem);
    }
    public static int dp(int n,int i,Integer mem[]){
        if(i == n - 1) return 1;
        if(i == n - 2) return 2;
        if(mem[i]!=null) return mem[i];
        mem[i] = dp(n,i+1,mem)+dp(n,i+2,mem);
        return mem[i];
    }
}
