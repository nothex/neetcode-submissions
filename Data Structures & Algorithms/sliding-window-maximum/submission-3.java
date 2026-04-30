class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
     int []res=new int [nums.length-k+1];
     Deque <Integer> deq=new LinkedList<>();
     for(int i=0;i<nums.length;i++){
        if(!deq.isEmpty() && deq.peekFirst()<i-k+1)
           deq.pollFirst();
        while(!deq.isEmpty() && nums[deq.peekLast()] < nums[i]){
            deq.pollLast();
        }
        deq.offer(i);
        if(i>=k-1){
            res[i-k+1]=nums[deq.peekFirst()];
        }   
     }
     return res;
    }
}

/* int []res=new int[nums.length-k+1];
        int max=Integer.MIN_VALUE;
        for(int i=1;i<=nums.length-k+1;i++){
            for(int j=i-1;j<i+k-1;j++){
                max=Math.max(max,nums[j]);
            }
            res[i-1]=max;
            max=Integer.MIN_VALUE;
        }
        return res;
        }*/

