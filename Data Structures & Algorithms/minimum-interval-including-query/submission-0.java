class Solution {
    public int[] minInterval(int[][] intervals, int[] queries) {
        int res[]=new int[queries.length];
        Arrays.fill(res,-1);
        int len=Integer.MAX_VALUE;
        for(int i=0;i<queries.length;i++){
            for(int j=0;j<intervals.length;j++){
                if(intervals[j][0]<=queries[i] && queries[i]<=intervals[j][1] ){
                    len = intervals[j][1] - intervals[j][0] +1;
                    if(res[i]==-1) res[i]=Integer.MAX_VALUE;
                    res[i]= Math.min(res[i],len);
                }
            }
        }
        return res;
    }
}
