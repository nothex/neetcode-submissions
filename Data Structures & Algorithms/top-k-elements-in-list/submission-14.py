class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        if k==0 :
            return []
        fre={}
        for num in nums:
            fre[num]=fre.get(num,0)+1
        
        bucket=[[] for _ in range(len(nums)+1)]
        for num,freq in fre.items():
            bucket[freq].append(num)
        
        res=[]
        for i in range(len(bucket)-1,0,-1):
            for num in bucket[i]:
                res.append(num)

                if len(res)==k:
                    return res
        
