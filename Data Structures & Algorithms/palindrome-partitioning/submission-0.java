class Solution {
    public List<List<String>> partition(String s) {
       List<List<String>> result = new ArrayList<>();
       backtrack(0,s,new ArrayList<>(),result);
       return result; 
    }
    public static void backtrack(int start,String s,List<String> current,List<List<String>> result){
        if(start == s.length())
        {
            result.add(new ArrayList<>(current));
            return;
        }
        for(int end = start+1;end<=s.length();end++){
            String sub=s.substring(start,end);
            if(isPalindrome(sub)){
                current.add(sub);
                backtrack(end,s,current,result);
                current.remove(current.size()-1);
            }
        }
    }
    public static boolean isPalindrome(String str){
        int s=0,e=str.length()-1;
        while(s<=e){
            if(str.charAt(s) != str.charAt(e)) return false;
            s++;
            e--;
        }
        return true;
    }
}