class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int res=0;
        Arrays.sort(intervals,(a,b) -> Integer.compare(a[0],b[0]));
        int[] curr=intervals[0];
        for(int i=1;i<intervals.length;i++){
            if(curr[1]>intervals[i][0]){
                curr[1]=Math.min(curr[1],intervals[i][1]);
                res++;
            }
            else curr=intervals[i];
        }
        return res;
    }
}
