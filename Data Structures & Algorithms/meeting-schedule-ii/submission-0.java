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
    public int minMeetingRooms(List<Interval> intervals) {
        if(intervals.size()==0) return 0;
        int maxroom=0;
        for(int i=0;i<intervals.size();i++){
        Interval temp=intervals.get(i);
        int room=0;
        for(int j=0;j<intervals.size();j++){
            if(temp.start>=intervals.get(j).start && temp.start<intervals.get(j).end) room++;
        }
       maxroom=Math.max(maxroom,room);
    }
    return maxroom;
}
}