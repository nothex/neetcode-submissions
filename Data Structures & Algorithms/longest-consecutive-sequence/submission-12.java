class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int n:nums){
            set.add(n);
        }
        int longest=0;
        for(int n:nums){
            int count=0;
            while(set.contains(n)){
                count++;
                n++;
            }
            longest=Math.max(longest,count);
        }
        return longest;
    }

}
