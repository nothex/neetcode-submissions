class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        int longest=0;
        for(int n:nums){
            set.add(n);
        }
        for(int n:nums){
            int count=0;
            if(!set.contains(n-1)){
                while(set.contains(n)){
                    n++;
                    count++;
                }
            }
            longest=Math.max(longest,count);
        }
        return longest;
    }
}
