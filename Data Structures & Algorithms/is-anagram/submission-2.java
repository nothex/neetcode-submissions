class Solution {
    public boolean isAnagram(String s, String t) {
    if(s.length()==t.length()){
    int[] num = new int[123];
    for(int i=0;i<s.length();i++)
    {
        num[s.charAt(i)]+=1;
        num[t.charAt(i)]-=1;
    }
    for(int nums:num){
        if(nums!=0)
        return false;
    }
    return true;
    }
    return false;
    }
}
