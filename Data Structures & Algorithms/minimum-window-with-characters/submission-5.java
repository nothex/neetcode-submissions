class Solution {
    public String minWindow(String s, String t) {
        int []need=new int[128];
        int []window=new int[128];
        int unique=0,formed=0,l=0,r=0,len=s.length()+1,start=0;
        for(char c:t.toCharArray()){
            if(need[c]==0) unique++;
            need[c]++;
        }
        for(;r<s.length();){
            window[s.charAt(r)]++;
            if(need[s.charAt(r)] == window[s.charAt(r)] ) formed++;
            while(l<=r && formed==unique){
                if(len>r-l+1){
                    len = r-l+1;
                    start=l;
                }
            window[s.charAt(l)]--;    
            if(need[s.charAt(l)] > window[s.charAt(l)] ) formed--; 
            l++;
            }
            r++;
        }
        return len==s.length()+1?"":s.substring(start,start+len);
    }
}
