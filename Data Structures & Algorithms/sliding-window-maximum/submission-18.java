class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> dq=new LinkedList<>();
        int []res=new int[nums.length-k+1];
        for(int i=0;i<nums.length;i++){
            if(!dq.isEmpty() && i-k+1>dq.peek()) dq.pollFirst();
            while(!dq.isEmpty() && nums[dq.peekLast()]<nums[i]) dq.pollLast();
            dq.offer(i);
            if(i>=k-1){
                res[i-k+1]=nums[dq.peek()];
            }
        }
        return res;
    }
}
