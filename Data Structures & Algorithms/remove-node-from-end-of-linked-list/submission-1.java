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
    public ListNode removeNthFromEnd(ListNode head, int n) {
    ListNode temp=head;
    ListNode dummy=temp;
    int count=0;
    while(temp!=null){
    temp=temp.next;
    count++;
    }
    int index_taken=count-n;
    if(index_taken==0 && n==1) return null;
    temp=head;
    count=0;
    while(temp!=null){
        if(index_taken-1==count) temp.next=temp.next.next;
        count++;
        temp=temp.next;
    }
    if(index_taken==0 && count==n) return dummy.next;
    return dummy;
    }
}
