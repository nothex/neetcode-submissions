class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
    HashMap<String,List<String>> list=new HashMap<>();
    for(String word:strs){
        char[] cr=word.toCharArray();
        Arrays.sort(cr);
        String sorted=new String(cr);

        list.putIfAbsent(sorted,new ArrayList<>());
        list.get(sorted).add(word);
    }
    return new ArrayList<>(list.values());
}
}
