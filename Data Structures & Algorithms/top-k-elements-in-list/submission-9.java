class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int n:nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        List<Integer> bucket[]=new List[nums.length+1];
        for(Map.Entry<Integer,Integer> mp:map.entrySet()){
            if(bucket[mp.getValue()]==null) bucket[mp.getValue()]=new ArrayList<>();
            bucket[mp.getValue()].add(mp.getKey());
        }
        int res[]=new int[k];
        int index=0;
        for(int i=nums.length;i>-1;i--){
            if(bucket[i]!=null){
                for(int n:bucket[i]){
                    if(index==k) break;
                    res[index++]=n;
                }
            }
        }
        return res;
    }
}
