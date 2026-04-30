class Solution:
    def lastStoneWeight(self, stones: List[int]) -> int:
        heap=[]
        heap=[-i for i in stones]
        heapq.heapify(heap)
        # 2 2 3 4 6
        # -6 -4 -3 -2 -2
        # -3 -2 -2 -2
        # -2 -2 -1
        # -1 0
        #  1

        while len(heap)>=1:
            if len(heap)==1:
                return -heap[0]
            x = -heapq.heappop(heap)
            y = -heapq.heappop(heap)
            if x>y:
                heapq.heappush(heap,-(x-y))
            if x==y:
                continue
        return 0