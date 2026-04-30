class Solution {

    public String encode(List<String> strs) {
    String s="";
    for(String w:strs){
    s+=w+"|";
    }
    return s;
    }

    public List<String> decode(String str) {
    ArrayList<String> list=new ArrayList<>();
    String temp="";
    for(int i=0;i<str.length();i++){
        if(str.charAt(i)!='|')
        temp+=str.charAt(i);
        else{
            list.add(temp);
            temp="";
        }
    }
    return list;
    }
}
