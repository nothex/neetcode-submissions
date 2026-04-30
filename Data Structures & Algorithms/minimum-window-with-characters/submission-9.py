class Solution:
    def minWindow(self, s: str, t: str) -> str:
        have = {}
        need = {}
        fixed=0
        for c in t:
            if c not in need:
                fixed+=1
            need[c]=need.get(c,0)+1
        count=0
        i=j=0
        st,en,length=0,0,len(s)+1
        while j<len(s):
            c=s[j]
            have[c]=have.get(c,0)+1
            if c in t and need[c]==have[c]:
                count+=1
            while count==fixed:
                c=s[i]
                if j-i+1<length:
                    st=i
                    en=j+1
                    length=min(length,j-i+1)
                have[c]=have.get(c,0)-1
                if c in t and need[c]>have[c]:
                    count-=1
                i+=1
            j+=1
        if st==en:
            return ""
        else :
            return s[st:en]