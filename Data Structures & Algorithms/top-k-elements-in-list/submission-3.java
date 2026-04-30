class Solution {
    public int[] topKFrequent(int[] nums, int k) {
    HashMap<Integer,Integer> map=new HashMap<>();
    for(int n:nums){
        map.put(n,map.getOrDefault(n,0)+1);
    }
    List<Integer>[] Bucket=new List[nums.length+1];

    for(Map.Entry<Integer,Integer> entry:map.entrySet()){
        if(Bucket[entry.getValue()]==null) Bucket[entry.getValue()]=new ArrayList<>();
        Bucket[entry.getValue()].add(entry.getKey());
    }

    int index=0;
    int res[]=new int[k];
    for(int i=nums.length;i>=1 && index<k;i--){
        if(Bucket[i]!=null){
            for(int n:Bucket[i]){
                if(index<k) res[index++]=n;
                else break;
            }
        }
    }
    return res;
}
}
 


