class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> result =  new ArrayList<>();
        backtrack(0,s,result,new ArrayList<>());
        return result;
    }
    public static void backtrack(int index,String word,List<List<String>> result,List<String> current){
        if (index == word.length()){
            result.add(new ArrayList<>(current));
            return ;
        }
        for(int i=index+1;i<=word.length();i++){
            String sub=word.substring(index,i);
            if(isPalindrome(sub)){
            current.add(sub);
            backtrack(i,word,result,current);
            current.remove(current.size()-1);
        }
        }
    }
    public static boolean isPalindrome(String word){
          int start = 0,end = word.length()-1;
          while(start <= end){
            if(word.charAt(start)!=word.charAt(end)) return false;
            start++;
            end--;
          }
          return true;
    }

}
