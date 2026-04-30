class Solution {
    public String minWindow(String s, String t) {
        int []mapT=new int[128];
        int unique=0;
        for(char c:t.toCharArray()){
            if(mapT[c]==0) unique++;
            mapT[c]++;
        }
        int []window=new int[128];
        int len=s.length()+1,start=0,formed=0;
        for(int i=0,j=0;i<s.length();){
            window[s.charAt(i)]++;
            if(window[s.charAt(i)] == mapT[s.charAt(i)]) formed++;
            
            while(j<=i && formed == unique){
                if(i-j+1<len){
                    len=i-j+1;
                    start=j;
                }
            window[s.charAt(j)]--; 
            if(window[s.charAt(j)] < mapT[s.charAt(j)]) formed--;
            j++;
            }
            i++;
        }
        return len==s.length()+1?"":s.substring(start,start+len);

    }
}
