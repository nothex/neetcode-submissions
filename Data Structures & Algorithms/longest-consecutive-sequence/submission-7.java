class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> list= new HashSet<>();
        if(nums.length==0) return 0;
        for(int num:nums){
        list.add(num);
        }
        int longest=0;
        for(int num:nums){
            int nu=num;
            int count=1;
            if(!list.contains(nu-1))
            {
                while(list.contains(nu+1)){
                    nu++;
                    count++;
                }
            }
            longest=Math.max(count,longest);
        }
        return longest;
}
}