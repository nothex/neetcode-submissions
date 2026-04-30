# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        dummy=ListNode(0,head)
        f=dummy
        for i in range(n+1):
            f=f.next
            if f==None:
                break
        s=dummy
        while f!=None:
            f=f.next
            s=s.next
        s.next=s.next.next
        return dummy.next
        