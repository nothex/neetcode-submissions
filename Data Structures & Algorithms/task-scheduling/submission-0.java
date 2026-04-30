class Solution {
    public int leastInterval(char[] tasks, int n) {
        int freq[]=new int[26];
        for(char task:tasks){
            freq[task-'A']+=1;
        }
        PriorityQueue<Integer> maxHeap=new PriorityQueue<>((a,b) -> Integer.compare(b,a));
        for(int f:freq){
            if(f>0) maxHeap.offer(f);
        }
        Queue<int[]> compile=new LinkedList<>();
        int time=0;
        while(!maxHeap.isEmpty() || !compile.isEmpty()){
            time++;
            if(!maxHeap.isEmpty()){
                int count = maxHeap.poll()-1;
                if(count > 0){
                    compile.offer(new int[]{count,time+n});
                }
            }
            if(!compile.isEmpty() && compile.peek()[1]==time){
                maxHeap.offer(compile.poll()[0]);
            }
        }
        return time;
    }
}
