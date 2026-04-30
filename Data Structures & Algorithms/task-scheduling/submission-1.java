class Solution {
    public int leastInterval(char[] tasks, int n) {
        int freq[]=new int[26];
        for(char task:tasks){
            freq[task-'A']++;
        }
        PriorityQueue<Integer> maxheap=new PriorityQueue<>((a,b) -> b-a);
        for(int f:freq){
            if(f>0){
                maxheap.offer(f);
            }
        }
        Queue<int []> compile= new LinkedList<>();
        int time=0;
        while(!maxheap.isEmpty() || !compile.isEmpty()){
            time++;
            if(!maxheap.isEmpty()){
            int count = maxheap.poll()-1;
            if(count > 0){
                compile.offer(new int[]{count,time+n});
            }
            }
            if(!compile.isEmpty() && compile.peek()[1]==time){
               maxheap.offer(compile.poll()[0]);
            }

        }
        return time;
    }
}
