class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        se=set()
        i=j=0
        res=0
        while j<len(s):
            while s[j] in se:
                se.remove(s[i])
                i+=1
            se.add(s[j])
            res=max(res,j-i+1)
            j+=1
        return res
            