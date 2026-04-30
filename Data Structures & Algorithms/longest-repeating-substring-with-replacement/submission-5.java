class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer> map=new HashMap<>();
        int len=0,res=0;
        for(int l=0,r=0;r<s.length();r++){
            map.put(s.charAt(r),map.getOrDefault(s.charAt(r),0)+1);
            len=Math.max(len,map.get(s.charAt(r)));
            if(r-l+1-len<=k){
                res=Math.max(res,r-l+1);
            }
            else{
                map.put(s.charAt(l),map.getOrDefault(s.charAt(l),0)-1);
                l++;
            }
        }
        return res;
    }
}
