class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        ArrayList<List<Integer>> res=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                for(int k=0;k<nums.length;k++){
                    if(i!=j && j!=k && k!=i){
                        if(nums[i]+nums[j]+nums[k]==0){
                            ArrayList<Integer> list=new ArrayList<>();
                            list.add(nums[i]);
                            list.add(nums[j]);
                            list.add(nums[k]);
                            Collections.sort(list);
                            if(!res.contains(list))
                            res.add(list);
                        }
                    }
                }
            }
        }
        return res;
    }
}

// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         HashMap<Integer,Integer> map=new HashMap<>();
//         for(int i=0;i<nums.length;i++){
//             if(map.containsKey(target-nums[i])) return new int[]{map.get(target-nums[i]),i};
//             map.put(nums[i],i);
//         }
//         return new int[]{-1,-1};
//     }
// }

