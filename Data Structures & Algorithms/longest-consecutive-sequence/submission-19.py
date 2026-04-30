class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        l=set()
        for num in nums:
            l.add(num)
        res=0
        for i in nums:
            count=0
            if i-1 not in l:
                while i in l:
                    count+=1
                    i+=1
            res=max(res,count)
        return res