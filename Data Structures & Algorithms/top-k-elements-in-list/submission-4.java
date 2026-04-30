class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int n:nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        List<Integer> []bucket =new List[nums.length+1];
        
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            int freq=entry.getValue();
            if(bucket[freq]==null) bucket[freq]=new ArrayList<>();
            bucket[freq].add(entry.getKey());
        }
        int index=0;
        int res[]=new int[k];
        for(int i=nums.length;i>=0;i--){
            if(bucket[i]!=null){
                for(int n:bucket[i]){
                    if(index<k) res[index++]=n;
                    else break;
                }
            }
        }
        return res;
    }
}
