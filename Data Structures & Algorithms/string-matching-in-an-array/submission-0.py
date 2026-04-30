class Solution:
    def stringMatching(self, words: List[str]) -> List[str]:
        res = set()
        for i in range(len(words)):
            for j in range(len(words)):
                if i==j:
                    continue
                else:
                    if len(words[i])<=len(words[j]):
                        if kmp(words[i],words[j]):
                            res.add(words[i])
                    elif len(words[i])>len(words[j]):
                        if kmp(words[j],words[i]):
                            res.add(words[j])
        return list(res)
def lps(p):
    i,j=0,1
    lp=[0]*len(p)
    while j<len(p):
        if p[i]==p[j]:
            i+=1
            lp[j]=i
            j+=1
        else:
            if i==0:
                lp[j]=0
                j+=1
            else:
                i=lp[i-1]
    return lp
def kmp(p,t):
    i=j=0
    lp=lps(p)
    while j<len(t):
        if p[i]==t[j]:
            i+=1
            j+=1
            if i == len(p): 
                return True
        else:
            if i==0:
                j+=1
            else:
                i=lp[i-1]
    return i==len(p)


