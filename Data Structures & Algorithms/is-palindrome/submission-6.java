class Solution {
    public boolean isPalindrome(String s) {
     StringBuilder st = new StringBuilder();
    for(int i=0;i<s.length();i++)
    {
        char ch=Character.toUpperCase(s.charAt(i));
        if(Character.isLetterOrDigit(ch)){
        st.append(ch);
        }
    }
    int sta=0,en=st.length()-1;
    for(int i=0;i<st.length()/2;i++){
       if(st.charAt(sta)!=st.charAt(en))
       return false;
       sta++;
       en--;
    }
    
    return true;
    }
}
