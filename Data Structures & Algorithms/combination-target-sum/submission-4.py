class Solution:
    def combinationSum(self, nums: List[int], target: int) -> List[List[int]]:
        cur=[]
        res=[]
        nums.sort()
        def dfs(cur,target,index):
            if target==0:
                res.append(cur[:])
                return
            for i in range(index,len(nums)):
                if target-nums[i]<0:
                    break
                cur.append(nums[i])
                dfs(cur,target-nums[i],i)
                cur.pop()
        dfs(cur,target,0)
        return res