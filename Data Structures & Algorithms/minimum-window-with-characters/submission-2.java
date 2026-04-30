class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character,Integer> mapT=new HashMap<>();
        HashMap<Character,Integer> window=new HashMap<>();
        for(char c:t.toCharArray()){
            mapT.put(c,mapT.getOrDefault(c,0)+1);
        }
        int required=mapT.size(),formed=0,minlen=s.length()+1,start=0,l=0,r=0;
        
        while(r<s.length()){
            window.put(s.charAt(r),window.getOrDefault(s.charAt(r),0)+1);
            if(mapT.containsKey(s.charAt(r)) && window.get(s.charAt(r)).intValue() == mapT.get(s.charAt(r)).intValue()) formed++;

            while(l<=r && formed==required){
                if(r-l+1 < minlen){
                    minlen = r-l+1;
                    start=l;
                }
                window.put(s.charAt(l),window.getOrDefault(s.charAt(l),0)-1);
                if(mapT.containsKey(s.charAt(l)) && window.get(s.charAt(l)).intValue() < mapT.get(s.charAt(l)).intValue()) formed--;
                l++;
            }
            r++;
        }
        return minlen == s.length()+1 ? "" : s.substring(start, start + minlen);
    }
}
