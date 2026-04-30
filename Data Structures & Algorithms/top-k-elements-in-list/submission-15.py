class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        hp={}
        for n in nums:
            if n not in hp:
                hp[n]=1
            else:
                hp[n]+=1
        
        bucket=[[] for _ in range(len(nums)+1)]
        for ele,fre in hp.items():
            bucket[fre].append(ele)
        
        res=[]
        j=0
        for i in range(len(nums),0,-1):
            if bucket[i]!=None:
                for n in bucket[i]:
                    if j==k:
                        break
                    res.append(n)
                    j+=1
                    
        return res