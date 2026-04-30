# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:    
    def mergeKLists(self, lists: List[Optional[ListNode]]) -> Optional[ListNode]:
        def split(s,e):
            if s>e:
                return None
            if s==e:
                return lists[s]
            mid=(e-s)//2+s
            left=split(s,mid)
            right=split(mid+1,e)
            result=merge(left,right)
            return result
        def merge(l1,l2):
            dummy=ListNode()
            res=dummy
            while l1 and l2:
                if l1.val<=l2.val:
                    dummy.next=l1
                    l1=l1.next
                else:
                    dummy.next=l2
                    l2=l2.next
                dummy=dummy.next
            if not l1:
                dummy.next=l2
            else:
                dummy.next=l1
            return res.next
        return split(0,len(lists)-1)