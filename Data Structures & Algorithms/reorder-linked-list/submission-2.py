# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def reorderList(self, head: Optional[ListNode]) -> None:
        s=head
        f=head
        while f!=None and f.next!=None:
            f=f.next.next
            if f==None:
                break
            s=s.next
        t=s.next
        s.next=None
        s=t
        prev=None
        while s!=None:
            t=s.next
            s.next=prev
            prev=s
            s=t
        l1=head
        l2=prev

        # 2->4->None
        # 8->6->None 

        while l2!=None:
                       # 2->
                       # 8->
            t1=l1.next # ->4
            l1.next=l2 # 2->8

            t2=l2.next # ->6
            l2.next=t1 # 8->4
            
            l1=t1      # 4->
            l2=t2      # 8->
            


