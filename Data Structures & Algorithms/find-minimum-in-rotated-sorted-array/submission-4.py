class Solution:
    def findMin(self, nums: List[int]) -> int:
        i,j=0,len(nums)-1
        while i<j:
            mid=(j-i)//2+i
            if nums[mid]>=nums[j]:
                i=mid+1
            else:
                j=mid
        return nums[i]