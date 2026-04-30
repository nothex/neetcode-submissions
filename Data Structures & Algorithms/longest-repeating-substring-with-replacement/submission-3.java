class Solution {
    public int characterReplacement(String s, int k) {
       HashMap<Character,Integer> tab= new HashMap<>();
       int res=0,maxfreq=0,l=0;
       for(int r=0;r<s.length();r++){
        tab.put(s.charAt(r),tab.getOrDefault(s.charAt(r),0)+1);
        maxfreq=Math.max(maxfreq,tab.get(s.charAt(r)));
        if(r-l+1-maxfreq<=k)
        {
            res=Math.max(res,r-l+1);
        }
        else{
            tab.put(s.charAt(l),tab.getOrDefault(s.charAt(l),0)-1);
            l++;
        }
       }
       return res;
    }
}
