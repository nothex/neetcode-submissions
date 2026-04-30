class Solution {

    public String encode(List<String> strs) {
        StringBuilder st=new StringBuilder();
        for(String word:strs){
            st.append(word.length()).append("#").append(word);
        }
        return st.toString();
    }

    public List<String> decode(String str) {
        int j=0;
        ArrayList<String> list=new ArrayList<>();
        for(int i=0;i<str.length();){
            j=i;
            while(str.charAt(j)!='#') j++;
            int len=Integer.parseInt(str.substring(i,j));
            j++;
            list.add(str.substring(j,j+len));
            i=j+len;
        }
        return list;

    }
}
