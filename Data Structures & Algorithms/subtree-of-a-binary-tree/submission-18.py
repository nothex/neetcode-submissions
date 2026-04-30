# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:   
    def isSubtree(self, root: Optional[TreeNode], subRoot: Optional[TreeNode]) -> bool:
        p=serialize(subRoot)
        t=serialize(root)

        lp=lps(p)
        i=j=0
        while j<len(t):
            if t[j]==p[i]:
                i+=1
                j+=1
            else:
                if i==0:
                    j+=1
                else:
                    i=lp[i-1]
            if i==len(p):
                return True
        return False
def serialize(s):
    stack=[s]
    res=[]
    while stack:
        node=stack.pop()
        if not node:
            res.append("#")
            continue
        res.append(str(node.val))
        stack.append(node.left)
        stack.append(node.right)
    return "".join(res)

def lps(s):
    i,j=0,1
    t=[0]*len(s)
    while j<len(s):
        if s[i]==s[j]:
            i+=1
            t[j]=i
            j+=1
        else:
            if i==0:
                j+=1
            else:
                i=t[i-1]
    return t

                
