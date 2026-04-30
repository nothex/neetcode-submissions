class Solution {
    public int characterReplacement(String s, int k) {
        int []map=new int[26];
        int max=0,res=0;
        for(int r=0,l=0;r<s.length();r++){
            max=Math.max(max,++map[s.charAt(r)-'A']);
            if(r-l+1-max<=k) res=Math.max(res,r-l+1);
            else {
                map[s.charAt(l)-'A']--;
                l++;
            }
        }
        return res;
    }
}
