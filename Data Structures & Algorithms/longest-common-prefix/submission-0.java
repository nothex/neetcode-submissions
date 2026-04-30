class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix=strs[0];
        for(int i=1;i<strs.length;i++){
            prefix=compare(prefix,strs[i]);
        }
        return prefix;
    }
    public String compare(String s1,String s2){
        int len=Math.min(s1.length(),s2.length());
        StringBuilder res=new StringBuilder();
        for(int i=0;i<len;i++){
            if(s1.charAt(i) == s2.charAt(i)) res.append(s1.charAt(i));
            else break;
        }
        return res.toString();
    }
}