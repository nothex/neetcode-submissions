class Solution {
    public int countSubstrings(String s) {
       StringBuilder st = new StringBuilder("^");
        for(char c:s.toCharArray()){
            st.append("#").append(c);
        }
        st.append("#$");
        String T = st.toString();
        int []p = new int[T.length()];
        int mirr=0,r=0,c=0;
        for(int i=1;i<p.length-1;i++){
            mirr = 2 * c - i ;
            if(i<r) p[i] = Math.min(r-i,p[mirr]);
            while(T.charAt(i+(p[i]+1)) == T.charAt(i-(p[i]+1))) p[i]++;
            if(p[i]+i>r){
                r=p[i]+i;
                c=i;
            }
        }
        int res=0;
        for(int i=1;i<T.length()-1;i++){
            res+=(p[i]+1)/2;
        }
        return res;
    }
}
