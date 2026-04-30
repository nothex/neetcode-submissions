# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def reorderList(self, head: Optional[ListNode]) -> None:
        s=f=head
        while f and f.next:
            if not f.next:
                break
            s=s.next
            f=f.next.next
        temp=s.next
        s.next=None
        s=temp

        curr=s
        pre=None
        while curr:
            temp=curr.next
            curr.next=pre
            pre=curr
            curr=temp
        
        l1=head
        l2=pre

        while l1 and l2:

            t1=l1.next
            l1.next=l2

            t2=l2.next
            l2.next=t1

            l1=t1
            l2=t2
        

        
            