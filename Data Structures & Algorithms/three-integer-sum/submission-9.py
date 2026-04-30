class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        nums.sort()
        res=[]
        # [-4,-1,-1,,0,1,2]
        for i in range(len(nums)-2):
            if i>0 and nums[i-1]==nums[i]:
                continue
            j=i+1
            k=len(nums)-1
            while j<k:
                if nums[i]+nums[j]+nums[k]==0:
                    res.append([nums[i],nums[j],nums[k]])
                    while j<k and nums[j+1]==nums[j]:
                        j+=1
                    while j<k and nums[k-1]==nums[k]:
                        k-=1
                if nums[i]+nums[j]+nums[k]<0:
                    j+=1
                else:
                    k-=1
        return res
                    