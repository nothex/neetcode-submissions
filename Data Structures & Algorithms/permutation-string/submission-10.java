class Solution {
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character,Integer> map1=new HashMap<>();
        HashMap<Character,Integer> map2=new HashMap<>();
        if(s2.length()<s1.length()) return false;
        for(char c:s1.toCharArray()){
            map1.put(c,map1.getOrDefault(c,0)+1);
        }
        int len=s1.length();
        int count=0;
        for(int i=0;i<len;i++){
            map2.put(s2.charAt(i),map2.getOrDefault(s2.charAt(i),0)+1);
        }
        if(map1.equals(map2)) return true;
        for(int i=len;i<s2.length();i++){
            map2.put(s2.charAt(i),map2.getOrDefault(s2.charAt(i),0)+1);
            map2.put(s2.charAt(i-len),map2.getOrDefault(s2.charAt(i-len),0)-1);
            if (map2.get(s2.charAt(i-len)) == 0) {
        map2.remove(s2.charAt(i-len)); 
    }
            if(map1.equals(map2)) return true;
        }
        return false;
    }
}
