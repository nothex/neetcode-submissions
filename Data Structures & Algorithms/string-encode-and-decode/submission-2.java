class Solution {

    public String encode(List<String> strs) {
        String enc="|";
    for(String word:strs){
        enc+=word;
        enc+="|";
    }
    return enc;
    }

    public List<String> decode(String str) {
    List<String> lis=new ArrayList<>();
    if (str.equals("|")) return new ArrayList<>(); 
    for(int i=0;i<str.length();i++)
           {String st="";
        {if((i<str.length()-1) && str.charAt(i)=='|')
            i++;}
            while((i<str.length()-1) && !(i<str.length()-1 && str.charAt(i)=='|'))
            {st+=str.charAt(i);
            i++;}
        
            lis.add(st);
        }
    return lis;
    }
}
