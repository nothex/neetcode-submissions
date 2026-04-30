class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int n:nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        List<Integer> list[]=new List[nums.length+1];
        for(Map.Entry<Integer,Integer> m:map.entrySet()){
            if(list[m.getValue()] == null) list[m.getValue()]=new ArrayList<>();
            list[m.getValue()].add(m.getKey());
        }
        int []ans=new int[k];
        int index=0;
        for(int i=nums.length;i>-1;i--){
            if(list[i]!=null){
                for(int n:list[i]){
                    if(index==k) break;
                    ans[index++]=n;
                }
            }
        }
        return ans;
    }
}
