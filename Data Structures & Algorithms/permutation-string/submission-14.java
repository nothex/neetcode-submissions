class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int []freq1=new int[26];
        int []freq2=new int[26];
        if(s2.length()<s1.length()) return false;
        for(char c:s1.toCharArray()){
            freq1[c-'a']++;
        }
        for(int i=0;i<s2.length();i++){
            freq2[s2.charAt(i)-'a']++;
            if(i>=s1.length()) freq2[s2.charAt(i-s1.length())-'a']--;
            if(Arrays.equals(freq1,freq2)) return true;
        }
        return false;
    }
}
