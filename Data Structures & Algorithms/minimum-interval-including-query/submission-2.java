class Solution {
    public int[] minInterval(int[][] intervals, int[] queries) {
        int[][] qidx=new int[queries.length][2];
        int[] res=new int[queries.length];
        Arrays.fill(res,-1);
        int i=0;
        for(int []query:qidx){
            query[0]=queries[i];
            query[1]=i;
            i++;
        }
        Arrays.sort(intervals,(a,b)-> Integer.compare(a[0],b[0]));
        Arrays.sort(qidx,(a,b)-> Integer.compare(a[0],b[0]));
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)-> Integer.compare(a[0],b[0]));
        int idx=0;
        for(int []q:qidx){
            int query=q[0];
            int index=q[1];

            while(idx<intervals.length && query>=intervals[idx][0]){
                int len = intervals[idx][1]-intervals[idx][0]+1;
                pq.offer(new int[]{len,intervals[idx][1]});
                idx++;
            }
            while(!pq.isEmpty() && query>pq.peek()[1]){
                pq.poll();
            }
            if(!pq.isEmpty()){
                res[index]=pq.peek()[0];
            }
        }
        return res;
        
    }
}
