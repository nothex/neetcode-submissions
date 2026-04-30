class Solution:
    def combinationSum(self, nums: List[int], target: int) -> List[List[int]]:
        res=[]
        nums.sort()
        curr=[]
        def backtrack(index,target,curr,nums):
            if target==0:
                res.append(curr[:])
                return
            for i in range(index,len(nums)):
                if target-nums[i]<0:
                    break
                curr.append(nums[i])
                backtrack(i,target-nums[i],curr,nums)
                curr.pop()
        backtrack(0,target,curr,nums)
        return res


