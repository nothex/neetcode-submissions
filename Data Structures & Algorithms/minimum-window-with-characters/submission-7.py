class Solution:
    def minWindow(self, s: str, t: str) -> str:
        need={}
        for i in t:
            need[i]=need.get(i,0)+1
        unique=len(need)
        have={}
        start=end=0
        l=0
        formed=0
        length=1001
        for r in range(len(s)):
            have[s[r]]=have.get(s[r],0)+1
            if s[r] in need and need[s[r]]==have[s[r]]:
                formed+=1
            while formed==unique:
                if length>r-l+1:
                    length=r-l+1
                    start,end=l,r
                have[s[l]]-=1
                if s[l] in need and need[s[l]]>have[s[l]]:
                    formed-=1
                l+=1
        return "" if length==1001 else s[start:end+1]