class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        if len(strs) <2:
            return strs[0] if strs else ""
        f=strs[0]
        for i in range(1,len(strs)):
            f=self.compare(f,strs[i])
        return f
    @staticmethod
    def compare(st1: str, st2: str) -> str:    
        l=min(len(st1),len(st2))
        res=""
        for i in range(l):
            if st1[i]!=st2[i]:
                return st1[:i]
        return st1[:l]
        
