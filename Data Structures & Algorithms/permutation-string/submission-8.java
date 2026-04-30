class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int c1[]=new int[26];
        int c2[]=new int[26];

        for(char c:s1.toCharArray()){
            c1[c-'a']++;
        }
        for(int i=0;i<s2.length();i++){
            c2[s2.charAt(i)-'a']++;
            if(i>=s1.length()) c2[s2.charAt(i-s1.length())-'a']--;
            if(i>=s1.length()  - 1&& match(c1,c2)) return true;
        }
        return false;
    }
    public static boolean match(int []arr1,int []arr2){
        for(int i=0;i<26;i++){
            if(arr1[i]!=arr2[i]) return false;
        }
        return true;
    }
}
