class Solution {
    public List<List<Integer>> combinationSum2(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> result=new ArrayList<>();
        backtrack(0,nums,target,new ArrayList<>(),result);
        return result;
    }
    public static void backtrack(int index,int []nums,int target,List<Integer> current,List<List<Integer>> result)
    {
        if(target == 0) {
        result.add(new ArrayList<>(current));
        return;
        }
        if(target<0) return;
        for(int i=index;i<nums.length;i++){
            if(i>index && nums[i]==nums[i-1]) continue;
            current.add(nums[i]);
            backtrack(i+1,nums,target-nums[i],current,result);
            current.remove(current.size()-1);
        }
    }
}
