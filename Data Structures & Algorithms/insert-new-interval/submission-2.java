class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> result = new ArrayList<>();
        int l=0,h=intervals.length;
        while(l<h){
            int m = (l+h)/2;
            if(newInterval[0]>intervals[m][0]) l =m+1;
            else h=m;
        }
        int left=l-1;
        while(left>=0 && intervals[left][1]>=newInterval[0]){
            newInterval[0]=Math.min(intervals[left][0],newInterval[0]);
            newInterval[1]=Math.max(intervals[left][1],newInterval[1]);
            left--;
        }
        int right=l;
        while(right<intervals.length && intervals[right][0]<=newInterval[1]){
            newInterval[0]=Math.min(intervals[right][0],newInterval[0]);
            newInterval[1]=Math.max(intervals[right][1],newInterval[1]);
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
