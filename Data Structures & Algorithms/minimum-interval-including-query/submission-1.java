class Solution {
    public int[] minInterval(int[][] intervals, int[] queries) {
        int res[]=new int[queries.length];
        Arrays.fill(res,-1);
        int[][] qidx=new int [queries.length][2];
        for(int i=0;i<queries.length;i++){
            qidx[i][0]=queries[i];
            qidx[i][1]=i;
        }
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        Arrays.sort(qidx,(a,b)->Integer.compare(a[0],b[0]));
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->Integer.compare(a[0],b[0]));
        int i=0;
        for(int []q:qidx){
            int query=q[0];
            int index=q[1];
            while(i<intervals.length && intervals[i][0]<=query){
                pq.offer(new int[]{intervals[i][1]-intervals[i][0]+1,intervals[i][1]});
                i++;
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
