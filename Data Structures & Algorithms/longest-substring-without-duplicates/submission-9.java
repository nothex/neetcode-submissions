class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set=new HashSet<>();
        int longest=0;
        for(int i=0,j=0;i<s.length();){
            while(set.contains(s.charAt(i))){
                set.remove(s.charAt(j));
                j++;
            }
            longest=Math.max(longest,i-j+1);
            set.add(s.charAt(i));
            i++;
        }
        return longest;
    }
}
