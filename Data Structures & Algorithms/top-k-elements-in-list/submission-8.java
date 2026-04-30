class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int n:nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        List<Integer> bucket[]=new List[nums.length+1];
        for(Map.Entry<Integer,Integer> key:map.entrySet()){
            int index=key.getValue();
            if(bucket[index]==null) bucket[index]=new ArrayList<>();
            bucket[index].add(key.getKey());
        } 
        int ind=0;
        int res[]=new int[k];
        for(int i=nums.length;i>-1;i--){
            if(bucket[i]!=null){
                for(int n:bucket[i]){
                    if(ind==k) break;
                    res[ind++]=n;
                }
            }
        }
        return res;
    }
}
