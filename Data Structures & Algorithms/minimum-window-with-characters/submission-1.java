class Solution {
    public String minWindow(String s, String t) {
    HashMap<Character,Integer> count=new HashMap<>();
    HashMap<Character,Integer> window=new HashMap<>();
    
    for(int i=0;i<t.length();i++){
        count.put(t.charAt(i),count.getOrDefault(t.charAt(i),0)+1);
    }
    int l=0,need=count.size(),have=0,reslen=Integer.MAX_VALUE;
    String res="";
    for(int r=0;r<s.length();r++){
        window.put(s.charAt(r),window.getOrDefault(s.charAt(r),0)+1);
        if(count.containsKey(s.charAt(r)) && count.get(s.charAt(r))==window.get(s.charAt(r))){
            have++;
        }
        while(have==need){
            if(r-l+1<reslen){
                reslen=r-l+1;
                res=s.substring(l,r+1);
            }
            window.put(s.charAt(l),window.getOrDefault(s.charAt(l),0)-1);
            if(window.get(s.charAt(l))==0)
            window.remove(s.charAt(l));
            if(count.containsKey(s.charAt(l)) && count.get(s.charAt(l))>window.getOrDefault(s.charAt(l),0))
             have--;   
            l++; 
        }
    }
    return res;
    }
}
