class Solution:
    def search(self, nums: List[int], target: int) -> int:
        i,j=0,len(nums)-1

        while i<j:
            m=(j-i)//2+i
            if nums[m]>=nums[j]:
                i=m+1
            else:
                j=m

        def binary(s,e,target):
            while s<=e:
                mid=(e-s)//2+s
                if nums[mid]==target:
                    return mid
                elif nums[mid]<target:
                    s=mid+1
                else:
                    e=mid-1
            return -1
        pivot=i
        if nums[pivot]<=target and target<=nums[-1]:
            return binary(pivot,len(nums)-1,target)
        else:
            return  binary(0,pivot-1,target)  