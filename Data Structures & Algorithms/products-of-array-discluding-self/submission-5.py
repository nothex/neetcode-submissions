class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        pre=1
        res=[1]*len(nums)
        for i in range(len(nums)):
            res[i]=res[i]*pre
            pre*=nums[i]
        pre=1
        for i in range(len(nums)-1,-1,-1):
            res[i]=res[i]*pre
            pre*=nums[i]
        return res