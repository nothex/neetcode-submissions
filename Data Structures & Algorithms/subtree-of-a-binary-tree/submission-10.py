# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:   
    def isSubtree(self, root: Optional[TreeNode], subRoot: Optional[TreeNode]) -> bool:
        pattern=serialise(subRoot)
        target=serialise(root)
        lp=lps(pattern)
        i=j=0
        while j<len(target):
            if pattern[i]==target[j]:
                i+=1
                j+=1
            else:
                if i==0:
                    j+=1
                else:
                    i=lp[i-1]
            if i==len(pattern):
                return True
        return False
def serialise(root):
        if not root:
            return "#"
        return f"^{root.val}$"+serialise(root.left)+serialise(root.right)    

def lps(pat):
        i,j=0,1
        lps=[0]*len(pat)
        while j<len(pat):
            if pat[i]==pat[j]:
                i+=1
                lps[j]=i
                j+=1
            else:
                if i==0:
                    j+=1
                else:
                    i=lps[i-1]
        return lps
