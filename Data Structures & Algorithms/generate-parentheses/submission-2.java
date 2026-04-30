class Solution {
    public List<String> generateParenthesis(int n) {
        StringBuilder st=new StringBuilder();
        List<String> res=new ArrayList<>();
        bt(res,st,n,0,0);
        return res;
    }
    public static void bt(List<String> res,StringBuilder st,int max,int open,int close){
        if(open+close==2*max){
            res.add(st.toString());
            return;
        }
        if(open<max){
            bt(res,st.append('('),max,open+1,close);
            st.deleteCharAt(st.length()-1);
        }
        if(open>close){
            bt(res,st.append(')'),max,open,close+1);
            st.deleteCharAt(st.length()-1);
        }
    }
}
