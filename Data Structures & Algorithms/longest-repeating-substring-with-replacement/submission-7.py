class Solution:
    def characterReplacement(self, s: str, k: int) -> int:
        m=[0]*26
        i,j=0,0
        mat=-1
        res=0
        while j<len(s):
            m[ord(s[j])-ord('A')]+=1
            mat=max(mat,m[ord(s[j])-ord('A')])
            res=max(res,j-i)
            if j-i-mat+1<=k:
                res=max(res,j-i+1)
            else:
                m[ord(s[i])-ord('A')]-=1
                i+=1
            j+=1
        return res