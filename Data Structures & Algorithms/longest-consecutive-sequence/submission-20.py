class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        s=set()
        for n in nums:
            s.add(n)
        res=0
        for i in nums:
            count=0
            if i-1 not in s:
                while i in s:
                    count+=1
                    s.remove(i)
                    i=i+1
            res=max(res,count)
        return res