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
        for(int i=0;i<intervals.size();i++){
            Interval temp=intervals.get(i);
            for(int j=0;j<intervals.size();j++){
                if(i==j) continue;
                if(temp.end>intervals.get(j).start && intervals.get(j).end>temp.start) return false;
            }

        }
        return true;
    }
}
