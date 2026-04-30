class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set= new HashSet<>();
        if(nums.length==0) return 0;
        int lon=0;
        for(int num:nums){
           set.add(num);
        }
        for(int num:nums){
        if(!set.contains(num-1))
        {   int che=num;
            int count=1;
            while(set.contains(che+1))
            {
                che++;
                count++;
            }
            lon=Math.max(lon,count);
        }
        }
        return lon;
    }
}
