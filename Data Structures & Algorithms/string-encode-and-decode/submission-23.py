class Solution:

    def encode(self, strs: List[str]) -> str:
        t=[]
        for i in strs:
            t.append(str(len(i)))
            t.append("#")
            t.append(i)
        return "".join(t)
    def decode(self, s: str) -> List[str]:
        i=j=0
        res=[]
        while i<len(s):
            j=i
            while s[j]!="#":
                j+=1
            length=int(s[i:j])
            j+=1
            res.append(s[j:j+length])
            i=j+length
        return res
