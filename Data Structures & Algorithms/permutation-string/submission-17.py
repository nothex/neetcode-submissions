class Solution:
    def checkInclusion(self, s1: str, s2: str) -> bool:
        ms1=[0]*26
        ms2=[0]*26
        for i in range(len(s1)):
            ms1[ord(s1[i])-ord('a')]+=1
        for i in range(len(s2)):
            if i>=len(s1):
                ms2[ord(s2[i-len(s1)])-ord('a')]-=1
            ms2[ord(s2[i])-ord('a')]+=1
            if ms1==ms2:
                return True
        return False
        
