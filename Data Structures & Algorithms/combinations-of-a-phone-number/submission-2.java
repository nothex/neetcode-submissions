class Solution {
    public List<String> letterCombinations(String digits) {
      HashMap<Character,List<Character>> map = new HashMap<>();
      if(digits == null || digits.length() == 0) return new ArrayList<>();
      map.put('2', Arrays.asList('a','b','c'));  
      map.put('3', Arrays.asList('d','e','f'));  
      map.put('4', Arrays.asList('g','h','i'));  
      map.put('5', Arrays.asList('j','k','l'));  
      map.put('6', Arrays.asList('m','n','o'));  
      map.put('7', Arrays.asList('p','q','r','s'));  
      map.put('8', Arrays.asList('t','u','v'));  
      map.put('9', Arrays.asList('w','x','y','z'));
      List<String> result = new ArrayList<>();
      backtrack(0,digits,map,result,new StringBuilder());
      return result;  
    }
    public static void backtrack(int index,String digits,HashMap<Character,List<Character>> map,List<String> result,StringBuilder current){
        if(index == digits.length()){
            result.add(current.toString());
            return;
        }
        for(char c:map.get(digits.charAt(index))){
            current.append(c);
            backtrack(index+1,digits,map,result,current);
            current.deleteCharAt(current.length() - 1);
        }
    }
}
