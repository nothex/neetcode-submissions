class Solution {

    public String encode(List<String> strs) {
    StringBuilder s=new StringBuilder("");
    for(String w:strs){
    
    s.append(w);
    s.append("|");
    }
    return s.toString();
    }

    public List<String> decode(String str) {
    ArrayList<String> list=new ArrayList<>();
        if(str.length()==0) return new ArrayList<>();
    StringBuilder temp=new StringBuilder("");
   
    for(int i=0;i<str.length();i++){
        if(str.charAt(i)!='|')
        temp.append(str.charAt(i));
        else {
          list.add(temp.toString());
          temp.setLength(0);
}
          
}
    return list;
    }
}

