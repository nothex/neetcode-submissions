class Solution:
    def findWords(self, board: List[List[str]], words: List[str]) -> List[str]:
        root={}
        for word in words:
            node=root
            for c in word:
                if c not in node:
                    node[c]={}
                node=node[c]
            node["#"]=True
        ROW=len(board)
        COL=len(board[0])
        res=set()
        def dfs(i,j,node,path):
            if "#" in node:
                res.add(path)
                node.pop("#")
            
            if i<0 or i>=ROW or j<0 or j>=COL:
                return 
            c=board[i][j]
            if c not in node:
                return
            board[i][j]="#"
            for di,dj in [(1,0),(0,1),(-1,0),(0,-1)]:
                dfs(i+di,j+dj,node[c],path+c)
            board[i][j]=c
            if not node[c]:
                node.pop(c)
        for r in range(ROW):
            for c in range(COL):
                dfs(r,c,root,"")
        return list(res)


