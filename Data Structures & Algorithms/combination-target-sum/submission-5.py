class Solution:
    def combinationSum(self, nums: List[int], target: int) -> List[List[int]]:
        res=[]
        curr=[]
        nums.sort()
        def dfs(nums,target,index):
            if index==len(nums):
                return
            
            if target==0:
                res.append(curr[:])
                return

            for i in range(index,len(nums)):
                if target-nums[i]<0:
                    break
                curr.append(nums[i])
                dfs(nums,target-nums[i],i)
                curr.pop()
        dfs(nums,target,0)
        return res