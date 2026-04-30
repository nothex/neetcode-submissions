class Solution {
    public int longestConsecutive(int[] nums) {
        int len=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int n:nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        int longest=0;
        for(int num:nums){
            int n=num;
            int count=0;
            if(!map.containsKey(n-1)){
                while(map.containsKey(n)){
                    count++;
                    n++;
                }
            }
            longest=Math.max(longest,count);
        }
        return longest;
    }
}
