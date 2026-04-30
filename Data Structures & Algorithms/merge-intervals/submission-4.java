class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals , (a,b) -> Integer.compare(a[0],b[0]));
        int []curr=intervals[0];
        List<int[]> result = new ArrayList<>();
        for(int i=1;i<intervals.length;i++){
            if(curr[1]>=intervals[i][0]) curr[1]=Math.max(intervals[i][1],curr[1]);
            else {
                result.add(curr);
                curr=intervals[i];
            }
        }
            result.add(curr);
            return result.toArray(new int[result.size()][]);

        }
    }
