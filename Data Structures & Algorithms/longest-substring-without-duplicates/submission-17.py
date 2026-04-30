class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        ans=i=j=0
        a=set()
        while j<len(s):
            if s[j] not in a:
                a.add(s[j])
                j+=1
            else:
                while s[j] in a:
                    a.remove(s[i])
                    i+=1
            ans=max(ans,j-i)
        return ans