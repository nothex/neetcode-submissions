class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map=new HashMap<>();
        for(String word:strs){
            int []arr=new int[26];
            for(int i=0;i<word.length();i++) arr[word.charAt(i)-'a']++;
            String key=Arrays.toString(arr);
            map.putIfAbsent(key,new ArrayList<>());
            map.get(key).add(word);
        }
        return new ArrayList<>(map.values());
    }
}
