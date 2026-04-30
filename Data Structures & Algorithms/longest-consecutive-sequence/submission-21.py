class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        s=set()
        ans=0
        for i in nums:
            s.add(i)

        for i in nums:
            count=0
            if i-1 not in s:
                while i in s:
                    count+=1
                    i+=1
            ans=max(ans,count)
        return ans