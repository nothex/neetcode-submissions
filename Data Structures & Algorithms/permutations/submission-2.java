class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        boolean []visited = new boolean [nums.length];
        backtrack(nums,visited,result,new ArrayList<>());
        return result;
    }
    public static void backtrack(int [] nums,boolean visited[],List<List<Integer>> result,List<Integer> current){
        if(nums.length == current.size()){
            result.add(new ArrayList<>(current));
            return ;
        }
        for(int i=0;i<nums.length;i++){
        if(visited[i]) continue;
        visited[i]=true;
        current.add(nums[i]);
        backtrack(nums,visited,result,current);
        current.remove(current.size()-1);
        visited[i]=false;
        }
    }
}
