class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        Arrays.sort(nums);
        int sum=-1;
        for(int i=0;i<nums.length;i++){
            if(i>0&&nums[i-1]==nums[i]) continue;
            int s=i+1,e=nums.length-1;
            
            while(s<e){
            sum=nums[i]+nums[s]+nums[e];
            
            if(sum==0){
             res.add(Arrays.asList(nums[i],nums[s],nums[e]));
             while(s<e&&nums[s+1]==nums[s])s++;
             while(s<e&&nums[e-1]==nums[e])e--;
             s++;
             e--;
            }
            else if(sum>0)
            e--;
            else s++;
            }
        }
        return res;
    }
}
