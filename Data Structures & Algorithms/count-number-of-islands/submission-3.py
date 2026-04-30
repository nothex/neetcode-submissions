class Solution:
    def numIslands(self, grid: List[List[str]]) -> int:
        ROW=len(grid)
        COL=len(grid[0])
        islands=0
        def dfs(i,j):
            if i<0 or i>=ROW or j<0 or j>=COL or grid[i][j]=="0":
                return
            grid[i][j]="0"
            for di,dj in [(1,0),(0,1),(-1,0),(0,-1)]:
                dfs(i+di,j+dj)
        for r in range(ROW):
            for c in range(COL):
                if grid[r][c]=="1":
                    islands+=1
                    dfs(r,c)
        return islands
