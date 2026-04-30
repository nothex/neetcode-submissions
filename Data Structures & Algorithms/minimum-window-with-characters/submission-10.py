class Solution:
    def minWindow(self, s: str, t: str) -> str:
        fixed=0
        needed={}
        have={}
        for i in t:
            if i not in needed:
                fixed+=1
            needed[i]=needed.get(i,0)+1
        i=j=c=start=end=0
        max_len=len(s)+1
        while j<len(s):
            have[s[j]]=have.get(s[j],0)+1
            if s[j] in needed and have[s[j]]==needed[s[j]]:
                c+=1
            while c==fixed:
                if j-i+1<max_len:
                    max_len=j-i+1
                    start=i
                    end=j
                have[s[i]] -= 1
                if s[i] in needed and needed[s[i]]>have[s[i]]:
                    c-=1
                i+=1
            j+=1
        if max_len==len(s)+1:
            return ""
        else:
            return s[start:end+1]

