class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> maxHeap=new PriorityQueue<>((a,b)->Integer.compare(b,a));
        int result=-1;
        for(int num:nums){
            maxHeap.offer(num);
        }
        for(int i=0;i<k;i++){
            result=maxHeap.poll();
        }
            return result;
}
}
