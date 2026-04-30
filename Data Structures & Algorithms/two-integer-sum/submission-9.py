class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        hp={}
        for i in range(len(nums)):
            if nums[i] not in hp:
                hp[target-nums[i]]=i
            else:
                return [hp[nums[i]],i]
        return [-1,-1]