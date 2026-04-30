class Solution {
    public boolean isAnagram(String s, String t) {
        int [] s1=new int[26];
        int [] s2=new int[26];
        for(char c:s.toCharArray()){
            s1[c-'a']++;
        }
        for(char c:t.toCharArray()){
            s2[c-'a']++;
        }
        for(int i=0;i<26;i++){
            if(s1[i]!=s2[i]) return false;
        }
        return true;
    }
}
