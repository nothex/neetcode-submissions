# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:   
    def isSubtree(self, root: Optional[TreeNode], subRoot: Optional[TreeNode]) -> bool:
        def serialize(s):
            stack=[s]
            res=[]
            while stack:
                curr=stack.pop()
                if not curr:
                    res.append(",#")
                    continue
                res.append(","+str(curr.val))
                stack.append(curr.right)
                stack.append(curr.left)
            return "".join(res)

        def lps(s):
            i,j=0,1
            l=[0]*len(s)

            while j<len(s):
                if s[i]==s[j]:
                    i+=1
                    l[j]=i
                    j+=1
                else:
                    if i==0:
                        j+=1
                    else:
                        i=l[i-1]
            return l

        pat=serialize(subRoot)
        target=serialize(root)

        lp=lps(pat)
        i=j=0

        while j<len(target):
            if pat[i]==target[j]:
                i+=1
                j+=1
            else:
                if i==0:
                    j+=1
                else:
                    i=lp[i-1]
            if i==len(pat):
                return True
            
        return False

