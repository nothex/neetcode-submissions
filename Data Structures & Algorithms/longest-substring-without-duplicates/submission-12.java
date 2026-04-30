class Solution {
    public int lengthOfLongestSubstring(String s) {
        int map[]=new int[128];
        int i=0,j=0,len=0;
        while(j<s.length()){
            while(map[s.charAt(j)]>0){
                map[s.charAt(i)]--;
                i++;
            }
            len = Math.max(len,j-i+1);
            map[s.charAt(j)]++;
            j++;
        }
        return len;
    }
}
