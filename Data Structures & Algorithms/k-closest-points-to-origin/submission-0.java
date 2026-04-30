class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int []> maxHeap =new PriorityQueue<>((a,b) -> Double.compare(distance(b),distance(a)));
        for(int []point:points){
            maxHeap.offer(point);
            if(maxHeap.size()>k) maxHeap.poll();
        }
        int result[][]=new int[k][2];
        int i=0;
        for(int []row:maxHeap){
            result[i++]=row;
        }
        return result;

    }
    public static double distance(int []point){
        return Math.sqrt(point[0]*point[0]+point[1]*point[1]);
    }
}
