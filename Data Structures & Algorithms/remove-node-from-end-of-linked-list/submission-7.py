# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        # 1 2 4 5 4 7 8     4   === 1 2 4 4 7 8 
        dummy = ListNode(0,head)
        s=dummy
        f=dummy
        for i in range(n+1):
            f=f.next
            if f==None:
                break
        # 1 2 3 4 5    n=1
        while f!=None:
            f=f.next
            s=s.next
        # 
        # 1 2 3 4 5 
        s.next=s.next.next
        return dummy.next