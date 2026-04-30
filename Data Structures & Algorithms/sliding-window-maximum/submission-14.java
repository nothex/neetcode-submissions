class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int []res=new int[nums.length-k+1];
        Deque<Integer> deque=new LinkedList<>();
        for(int i=0;i<nums.length;i++){
            if(!deque.isEmpty() && i-k+1>deque.peek()) deque.pollFirst();
            while(!deque.isEmpty() && nums[deque.peekLast()]<nums[i]) deque.pollLast();
            deque.offer(i);
            if(i>=k-1)res[i-k+1]=nums[deque.peek()];

        }
        return res;
    }
}
