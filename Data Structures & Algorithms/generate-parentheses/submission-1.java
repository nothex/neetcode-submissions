class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res=new ArrayList<>();
        StringBuilder st=new StringBuilder();
        int open=0,close=0;
        helper(res,st,n,open,close);
        return res;
    }
    public static void helper(List<String> res,StringBuilder st,int n,int open,int close){
        if(open+close == 2*n) {
            res.add(st.toString());
            return;
        }
        if(open>close) {
            helper(res,st.append(')'),n,open,close+1);
            st.deleteCharAt(st.length()-1);
        }
        if(open<n) {
            helper(res,st.append('('),n,open+1,close);
            st.deleteCharAt(st.length()-1);
        } 
}
}
