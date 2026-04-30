# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:    
    def mergeKLists(self, lists: List[Optional[ListNode]]) -> Optional[ListNode]:
        return split(lists,0,len(lists)-1)
def split(lists: List[Optional[ListNode]],start:int,end:int)-> Optional[ListNode]:
    if start>end:
        return None
    if start==end:
        return lists[start]
    s,e=start,end
    mid=(e-s)//2+s
    left=split(lists,s,mid)
    right=split(lists,mid+1,e)
    return merge(left,right)

def merge(l1:Optional[ListNode],l2:Optional[ListNode])-> Optional[ListNode]:
    res=ListNode(-1)
    dummy=res
    while l1!=None and l2!=None:
        if l1.val<l2.val:
            dummy.next=l1
            l1=l1.next
        else:
            dummy.next=l2
            l2=l2.next
        dummy=dummy.next
    if l1==None:
        dummy.next=l2
    else:
        dummy.next=l1
    return res.next