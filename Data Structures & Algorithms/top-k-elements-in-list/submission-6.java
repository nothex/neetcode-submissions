class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int n:nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        List<Integer> Bucket[]=new List[nums.length+1];
        for(Map.Entry<Integer,Integer> mp:map.entrySet()){
            if(Bucket[mp.getValue()]==null) Bucket[mp.getValue()]=new ArrayList<>();
            Bucket[mp.getValue()].add(mp.getKey());
        }
        int res[]=new int[k];
        int idx=0;
        for(int i=nums.length;i>=0;i--){
            if(Bucket[i]!=null){
                for(int n:Bucket[i]){
                    if(idx==k) break;
                    res[idx++]=n;
                }
            }
        }
        return res;
    }
}
