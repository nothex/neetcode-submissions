class Solution {
    public int lengthOfLongestSubstring(String s) {
        int []map=new int[128];
        int l=0,r=0,res=0;
        while(r<s.length()){
            while(map[s.charAt(r)]>0){
                map[s.charAt(l)]--;
                l++;
            }
            res=Math.max(res,r-l+1);
            map[s.charAt(r)]++;
            r++;
        }
        return res;
    }
}
