class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        int longest=0;
        for(int i=0,j=0;i<s.length();){
          while(map.containsKey(s.charAt(i))) {
                map.put(s.charAt(j),map.getOrDefault(s.charAt(j),0)-1);
                if(map.get(s.charAt(j)) == 0) map.remove(s.charAt(j));
                j++;
                }
        map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        i++;
        longest=Math.max(i-j,longest);
        }
        return longest;
    }
}
