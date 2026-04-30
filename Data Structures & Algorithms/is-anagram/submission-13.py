class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        dic={}
        if len(s) != len(t):
             return False

        for i in range(len(s)):
            if s[i] not in dic:
                dic[s[i]]=1
            elif s[i] in dic:
                dic[s[i]]=dic[s[i]]+1
            
            if t[i] not in dic:
                dic[t[i]]=-1
            elif t[i] in dic:
                dic[t[i]]=dic[t[i]]-1

        for i in dic:
            if dic[i]!=0:
                return False
        return True
            
