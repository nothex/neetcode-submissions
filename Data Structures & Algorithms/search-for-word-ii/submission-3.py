class TrieNode:
    def __init__(self):
        self.children={}
        self.ends=False
    def add(self,word):
        node=self
        for c in word:
            if c not in node.children:
                node.children[c]=TrieNode()
            node=node.children[c]
        node.ends=True
class Solution:
    def findWords(self, board: List[List[str]], words: List[str]) -> List[str]:
        root=TrieNode()
        for word in words:
            root.add(word)
        res=[]
        cur=[]
        def dfs(i,j,node,cur):
            if i in range(0,len(board)) and j in range(0,len(board[0])) and board[i][j]!="#":
                c=board[i][j]
                if c not in node.children:
                    return
                node=node.children[c]
                cur.append(c)
                if node.ends:
                    res.append("".join(cur))
                    node.ends=False
                board[i][j]="#"
                dfs(i+1,j,node,cur)
                dfs(i-1,j,node,cur)
                dfs(i,j+1,node,cur)
                dfs(i,j-1,node,cur)
                board[i][j]=c
                cur.pop()
            else:
                return
        for i in range(len(board)):
            for j in range(len(board[0])):
                dfs(i,j,root,cur)
        return res
