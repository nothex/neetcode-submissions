class Solution:
    def maxArea(self, heights: List[int]) -> int:
        length=len(heights)-1
        i,j=0,length
        res=0
        while i<j:
            if heights[i]<=heights[j]:
                res=max(res,length*heights[i])
                i+=1
            else:
                res=max(res,length*heights[j])
                j-=1
            length-=1
        return res