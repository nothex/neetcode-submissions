class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int n:nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        PriorityQueue<int []> pq=new PriorityQueue<>((a,b)->a[0]-b[0]);
        for(Map.Entry<Integer,Integer> mp:map.entrySet()){
            pq.offer(new int[]{mp.getValue(),mp.getKey()});
        }
        int res[]=new int[k];
        int index=k-1,start=map.size()-k;
        for(int i=0;i<map.size();i++){
            int re=pq.poll()[1];
            if(i>=start) res[index--]=re;
        }
        return res;
    }
}
