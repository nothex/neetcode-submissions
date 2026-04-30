class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        ArrayList<List<Integer>> bucket=new ArrayList<>();
        for(Integer key:map.keySet()){
            int index=map.get(key);
            while (bucket.size() <= index) {
        bucket.add(null);
    }
            if(bucket.get(index)==null) bucket.set(index,new ArrayList<>());
            bucket.get(index).add(key);
        }
        int j=0;
        int res[]=new int[k];
        for(int i=bucket.size()-1;i>=0 && j<k ;i--){
            if(bucket.get(i)!=null){
                for(int n:bucket.get(i)){
                    res[j]=n;
                    j++;
                    if(j==k) break;
                }
            }
        }
        return res;
    }
}
