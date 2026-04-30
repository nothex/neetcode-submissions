/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public void reorderList(ListNode head) {
        ListNode f=head;
        ListNode s=head;
        while(f!=null && f.next!=null){
        s=s.next;
        f=f.next.next;
        }
        ListNode prev=null;
        ListNode curr=s.next;
        ListNode temp=null;
        s.next=null;
        while(curr!=null){
            temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        temp=head;
        ListNode temps=head;
        ListNode tempp=prev;
        while(prev!=null && temp!=null){
        temps=temp.next;
        temp.next=prev;
        temp=temps;
        
        tempp=prev.next;
        prev.next=temp;
        prev=tempp;
        }
    }
}
