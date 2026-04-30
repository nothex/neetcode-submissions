class Solution:
    def numIslands(self, grid: List[List[str]]) -> int:
        visited=set()
        island=0
        def dfs(r,c,visited):
            if r<0 or r>=len(grid) or c<0 or c>=len(grid[0]) or (r,c) in visited or grid[r][c]=="0":
                return
           
            visited.add((r,c))
            dfs(r+1,c,visited)
            dfs(r-1,c,visited)
            dfs(r,c+1,visited)
            dfs(r,c-1,visited)
        for r in range(len(grid)):
            for c in range(len(grid[0])):
                if grid[r][c]=="1" and (r,c) not in visited:
                    dfs(r,c,visited)
                    island+=1
        return island

