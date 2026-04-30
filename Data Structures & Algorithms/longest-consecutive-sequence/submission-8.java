class Solution {
    public int longestConsecutive(int[] nums) {
       HashSet<Integer> arr= new HashSet<>();
       if(nums.length==0) return 0;
       for(int num:nums){
        arr.add(num);
       }
       int longest=0;
       for(int num:nums){
        
            int n=num;
            int counter=1;
        if(!arr.contains(n-1)){
            while(arr.contains(n+1)){
            counter++;
            n++;
           }
        longest=Math.max(longest,counter);
        }
       }
       return longest;
}
}