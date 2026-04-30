class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        i,j=0,0
        l=set()
        count=0
        while j<len(s):
            while s[j] in l: 
                l.remove(s[i])
                i+=1
            l.add(s[j])
            count=max(count,j-i+1)
            j+=1
        return count

