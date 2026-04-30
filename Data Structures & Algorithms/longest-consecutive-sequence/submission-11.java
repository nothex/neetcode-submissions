class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int n:nums){
            set.add(n);
        }
        int longest=0;
        for(int n:nums){
            int count=1;
            while(set.contains(n+1)){
                count++;
                n++;
            }
            longest=Math.max(longest,count);
        }
        return longest;
    }
}
