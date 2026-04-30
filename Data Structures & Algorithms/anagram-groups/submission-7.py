
def morph(strs:str) -> tuple[int]:
    l=[0]*26
    for i in strs:
        l[ord(i)-ord('a')]+=1
    return tuple(l)
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        HashMap={}
        for i in strs:
            key = morph(i)
            if key not in HashMap:
                HashMap[key]=[]
            HashMap[key].append(i)
        res=[]
        for i in HashMap:
            res.append(HashMap[i])
        return res
    
   
        
