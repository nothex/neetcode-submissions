class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> lis=new ArrayList<>();
        Stack<String> st=new Stack<>();
    
    backtrack(lis,st,n,0,0);
    return lis;
    }
    public void backtrack(List<String> lis,Stack<String> st,int n,int OpenN,int CloseN){
        if(OpenN==CloseN && CloseN==n && OpenN==n){
            StringBuffer sst=new StringBuffer();
            for (String s : st) {
                sst.append(s);
            }
            lis.add(sst.toString());
            return;
        }
        if(OpenN<n){
            st.push("(");
            backtrack(lis,st,n,OpenN+1,CloseN);
            st.pop();
        }
        if(OpenN>CloseN){
            st.push(")");
            backtrack(lis,st,n,OpenN,CloseN+1);
            st.pop();
        }
    }
}
