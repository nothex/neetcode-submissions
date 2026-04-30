class Solution:
    def maxArea(self, heights: List[int]) -> int:
        area=-1
        i,j=0,len(heights)-1
        breadth=len(heights)-1
        while i<j:
            if heights[i]<heights[j]:
                area=max(area,heights[i]*breadth)
                i+=1
            else:
                area=max(area,heights[j]*breadth)
                j-=1
            breadth-=1
        return area