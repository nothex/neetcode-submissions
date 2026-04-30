class Solution:
    def characterReplacement(self, s: str, k: int) -> int:
        mp=[0]*26
        i=j=0
        res=0
        ma=0
        while j<len(s):
            mp[ord(s[j])-ord('A')]+=1
            ma=max(ma,mp[ord(s[j])-ord('A')])
            if j-i+1<=k+ma:
                res=max(res,j-i+1)
            else:
                mp[ord(s[i])-ord('A')]-=1
                i+=1
            j+=1
        return res


