class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int s1count []=new int [26];

        for(int i=0;i<s1.length();i++){
            s1count[s1.charAt(i)-'a']++;
        }
        int windowsize=s1.length();
        for(int i=0;i<s2.length();i++){
            int windstart=0,windidx=i,match=0;
            int windowfreq []=new int [26];
            while(windstart<windowsize && windidx < s2.length()){
            windowfreq[s2.charAt(windidx)-'a']++;
            windstart++;
            windidx++;
            }
            for(int j=0;j<26;j++){
                if(s1count[j]==windowfreq[j])
                   match++;
            }
            if(Arrays.equals(s1count, windowfreq))
              return true;
        }
        return false;
        }
    }

