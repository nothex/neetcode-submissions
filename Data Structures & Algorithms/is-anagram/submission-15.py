class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        mp={}
        for c in s:
            if c not in mp:
                mp[c]=1
            else:
                mp[c]=mp[c]+1

        for c in t:
            if c not in mp:
                mp[c]=-1
            else:
                mp[c]=mp[c]-1
        
        for c in mp:
            if mp[c]!=0:
                return False
        return True