class Solution {
    public String minWindow(String s, String t) {
        int []need=new int[128];
        int []window=new int[128];
        int unique=0,formed=0,start=0,len=s.length()+1;
        for(char c:t.toCharArray()){
            if(need[c]==0) unique++;
            need[c]++;
        }
        for(int i=0,j=0;i<s.length();){
            window[s.charAt(i)]++;
            if(window[s.charAt(i)] == need[s.charAt(i)]) formed++;
            while(j<=i && formed==unique){
                if(i-j+1<len){
                    len=i-j+1;
                    start=j;
                }
                window[s.charAt(j)]--;
            if(window[s.charAt(j)] < need[s.charAt(j)]) formed--;
            j++;
            }
            i++;
        }
        return len==s.length()+1?"":s.substring(start,start+len);
    }
}
