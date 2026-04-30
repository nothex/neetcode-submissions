class Solution:
    def combinationSum(self, nums: List[int], target: int) -> List[List[int]]:
        nums.sort()
        def dfs(res,cur,index,nums,target):
            if target==0:
                res.append(cur[:])
                return
            for i in range(index,len(nums)):
                if target-nums[i]<0:
                    break
                cur.append(nums[i])
                dfs(res,cur,i,nums,target-nums[i])
                cur.pop()
            return 
        res=[]
        cur=[]
        dfs(res,cur,0,nums,target)
        return res
