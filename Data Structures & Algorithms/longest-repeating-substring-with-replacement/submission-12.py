class Solution:
    def characterReplacement(self, s: str, k: int) -> int:
        m=[0]*26
        i=j=ans=max_fre=0
        while j<len(s):
            m[ord(s[j])-ord('A')]+=1
            max_fre=max(max_fre,m[ord(s[j])-ord('A')])
            while j-i+1-max_fre>k:
                m[ord(s[i])-ord('A')]-=1
                i+=1
            ans=max(ans,j-i+1)
            j+=1
        return ans