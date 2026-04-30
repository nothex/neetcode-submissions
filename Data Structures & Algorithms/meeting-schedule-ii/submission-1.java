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
        int size=intervals.size();
        int i=0;
        int s[]=new int[size];
        int e[]=new int[size];
        for(Interval interval:intervals){
            s[i]=interval.start;
            e[i]=interval.end;
            i++;
        }
        Arrays.sort(s);
        Arrays.sort(e);
        int count=0;
        int st=0,en=0;
        int maxroom=0;
        for(i=0;i<size;i++){
            if(s[st]<e[en]) {
                count++;
                st++;}
            else if(s[st]>=e[en]){
                count--;
                en++;}
                maxroom=Math.max(maxroom,count);
        }
        return maxroom;
    }
}
