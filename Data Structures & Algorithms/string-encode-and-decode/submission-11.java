class Solution {

    public String encode(List<String> strs) {
        StringBuilder st=new StringBuilder();
        for(String word:strs){
            st.append(word.length());
            st.append("#");
            st.append(word);
        }
        return st.toString();
    }

    public List<String> decode(String str) {
        ArrayList<String> res=new ArrayList<>();
        int j=0;
        for(int i=0;i<str.length();){
            j=i;
            while(str.charAt(j)!='#') j++;
            int len=Integer.parseInt(str.substring(i,j));
            j++;
            res.add(str.substring(j,j+len));
            i=j+len;
        }
        return res;
    }
}
