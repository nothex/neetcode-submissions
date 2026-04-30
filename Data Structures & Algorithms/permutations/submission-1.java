class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        boolean []visited = new boolean[nums.length];
        backtrack(nums,result,visited,new ArrayList<>());
        return result;
    }
    public static void backtrack(int [] nums,List<List<Integer>> result,boolean [] visited,List<Integer> current ){
        if(nums.length == current.size()){
            result.add(new ArrayList<>(current));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(!visited[i]){
                visited[i]=true;
                current.add(nums[i]);
                backtrack(nums,result,visited,current);
                current.remove(current.size()-1);
                visited[i]=false;
            }
        }
    }
}
