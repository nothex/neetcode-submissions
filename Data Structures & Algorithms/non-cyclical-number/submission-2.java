class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set=new HashSet<>();
        while(!set.contains(n)){
        set.add(n);
        int res=sum(n);
        n=res;
        if(res==1) return true;
        else continue;
        }
        return false;
    }
    public int sum(int n){
        int sum=0;
        while(n!=0){
        int l=n%10;
        n/=10;
        sum+=l*l;
        }
        return sum;
    }
}
