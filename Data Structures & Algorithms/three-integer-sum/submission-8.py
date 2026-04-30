class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        nums.sort()
        res=[]
        for i in range(len(nums)-2):
            if i>0 and nums[i-1]==nums[i]:
                continue
            j=i+1
            k=len(nums)-1
            
            while j<k:
                if nums[i]+nums[j]+nums[k]==0:
                    temp=[]
                    temp.extend([nums[i],nums[j],nums[k]])
                    res.append(temp)
                    while j<k and nums[j]==nums[j+1]:
                        j+=1
                    while j<k and nums[k]==nums[k-1]:
                        k-=1
                if nums[i]+nums[j]+nums[k]<0:
                    j+=1
                else:
                    k-=1
        return res    
