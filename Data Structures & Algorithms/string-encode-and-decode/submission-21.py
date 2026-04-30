class Solution:

    def encode(self, strs: List[str]) -> str:
        st=''
        for i in strs:
            st+=str(len(i))
            st+='#'
            st+=i
        return st
    def decode(self, s: str) -> List[str]:
        res=[]
        i,j=0,0
        while i < len(s):
            j=i
            while s[j]!='#':
                j+=1
            length=int(s[i:j])
            j+=1
            res.append(s[j:j+length])
            i=j+length
        return res
