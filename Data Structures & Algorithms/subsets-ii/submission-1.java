class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        backtrack(0,nums,result,new ArrayList<>());
        return result;
    }
    public static void backtrack(int index,int []nums,List<List<Integer>> result,List<Integer> current){
        result.add(new ArrayList<>(current));
        for(int i=index;i<nums.length;i++){
            if(i > index && nums[i] == nums[i-1]) continue;
            current.add(nums[i]);
            backtrack(i+1,nums,result,current);
            current.remove(current.size()-1);
        }
    }
}
