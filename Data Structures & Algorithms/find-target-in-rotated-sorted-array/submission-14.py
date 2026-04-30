
class Solution:
    def search(self, nums: List[int], target: int) -> int:
        l,r=0,len(nums)-1
        while l<r:
            mid=(r-l)//2+l
            if nums[mid]>nums[r]:
                l=mid+1
            else:
                r=mid
        pivot=r
        b1=binary(nums,target,0,pivot-1)
        b2=binary(nums,target,pivot,len(nums)-1)
        return -1 if b1==b2 else max(b1,b2)
def binary(nums:List[int], target: int,start:int,end:int)->int:
    s=start
    e=end
    while s<=e:
        mid=(e-s)//2+s
        if nums[mid]==target:
            return mid
        elif nums[mid]<target:
            s=mid+1
        else:
            e=mid-1
    return -1