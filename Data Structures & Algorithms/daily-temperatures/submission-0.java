class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int c=0,p=0;
        int res[]=new int [temperatures.length];
        for(int i=0;i<temperatures.length;i++){
            for(int j=i+1;j<temperatures.length;j++){
                p++;
                if(temperatures[i]<temperatures[j])
                {
                c=p;
                break;
                }
            }
            res[i]=c;
            c=0;
            p=0;
        }
        return res;
    }
}