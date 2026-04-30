class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
    HashMap <String,List<String>> group = new HashMap<>();
    for(String word:strs){
        char [] charArray=word.toCharArray();
        Arrays.sort(charArray);
        String sortedword=new String(charArray);

        group.putIfAbsent(sortedword,new ArrayList<>());
        group.get(sortedword).add(word);
    }
    return new ArrayList<>(group.values());
    }
}

