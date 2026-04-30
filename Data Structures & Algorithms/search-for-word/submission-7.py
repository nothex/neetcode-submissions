class Solution:
    def exist(self, board: List[List[str]], word: str) -> bool:
        def dfs(r,c,i,word,board):
            if i == len(word):
                return True
            if r<0 or r>=len(board) or c<0 or c>=len(board[0]) or word[i]!=board[r][c]:
                return False
            t=board[r][c]
            board[r][c]='#'
            res=dfs(r+1,c,i+1,word,board) or dfs(r-1,c,i+1,word,board) or dfs(r,c+1,i+1,word,board) or dfs(r,c-1,i+1,word,board)
            board[r][c]=t
            return res
        for r in range(len(board)):
            for c in range(len(board[0])):
                if dfs(r,c,0,word,board):
                    return True
        return False