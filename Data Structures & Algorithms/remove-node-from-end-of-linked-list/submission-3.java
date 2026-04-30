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
        int size=0;
        while(temp!=null){
            temp=temp.next;
            size++;
        }
        int target=size-n,count=0;
        temp=head;
        if(target==0) return head.next;
        while(temp!=null){
           if(count+1==target){
            temp.next=temp.next.next;
            }
            temp=temp.next;
            count++;
        }
        return head;
    }
}
