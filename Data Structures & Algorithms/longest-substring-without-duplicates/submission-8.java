class Solution {
    public int lengthOfLongestSubstring(String s) {
        int lastSeen[]=new int[128];
        int i=0,j=0,longest=0;
        Arrays.fill(lastSeen,-1);
        for(char c:s.toCharArray()){
            if(lastSeen[c]>=j) j=lastSeen[c]+1;
            lastSeen[c]=i;
            longest=Math.max(longest,i-j+1);
            i++;
        }
        return longest;
    }
}
