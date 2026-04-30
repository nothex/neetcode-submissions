/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public boolean canAttendMeetings(List<Interval> intervals) {
        Collections.sort(intervals,(a,b)->Integer.compare(a.start,b.start));
        
        int size = intervals.size();
        if(size==0) return true;
        Interval temp = intervals.get(0);
        for(int i=1;i<size;i++){
            if(temp.end>intervals.get(i).start) return false;
            temp=intervals.get(i);
        }
        return true;
        
    }
}
