class Solution {
    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.length() == 0) return new ArrayList<>();
        HashMap<Character,List<Character>> map = new HashMap<>();

        map.put('2', Arrays.asList('a', 'b', 'c'));
        map.put('3', Arrays.asList('d', 'e', 'f'));
        map.put('4', Arrays.asList('g', 'h', 'i'));
        map.put('5', Arrays.asList('j', 'k', 'l'));
        map.put('6', Arrays.asList('m', 'n', 'o'));
        map.put('7', Arrays.asList('p', 'q', 'r','s'));
        map.put('8', Arrays.asList('t', 'u', 'v'));
        map.put('9', Arrays.asList('w', 'x', 'y','z'));

        List<String> result = new ArrayList<>();
        backtrack(0,map,result,digits,new StringBuilder());
        return result;
    }
    public static void backtrack(int start,HashMap<Character,List<Character>> map,List<String> result,String digits,StringBuilder current){
        if(start == digits.length()){
            result.add(current.toString());
            return;
        }
        
            char key = digits.charAt(start);
            List<Character> array = map.get(key);
            for(char c:array){
                current.append(c);
                backtrack(start+1,map,result,digits,current);
                current.deleteCharAt(current.length() - 1);
            }
        
    }
}
