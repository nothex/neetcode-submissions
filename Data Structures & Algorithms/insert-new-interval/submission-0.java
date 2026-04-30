class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int []> result = new ArrayList<>();
        int lo=0 , hi=intervals.length;
        while(lo<hi){
            int mid = (hi+lo)/2;
            if(intervals[mid][0]<newInterval[0]) lo = mid+1;
            else hi=mid;
        }
        int left = lo-1;
        while(left>=0 && newInterval[0]<=intervals[left][1]){
            newInterval[0]= Math.min(newInterval[0],intervals[left][0]);
            newInterval[1]= Math.max(newInterval[1],intervals[left][1]);
            left--;
        }
        int right = lo;
        while(right<intervals.length && newInterval[1]>=intervals[right][0]){
            newInterval[0]= Math.min(newInterval[0],intervals[right][0]);
            newInterval[1]= Math.max(newInterval[1],intervals[right][1]);
            right++;
        }
        for(int i=0;i<=left;i++){
            result.add(intervals[i]);
        }
        result.add(newInterval);
        for(int i=right;i<intervals.length;i++){
            result.add(intervals[i]);
        }
        return result.toArray(new int[result.size()][]);

    }
}
