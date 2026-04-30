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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode currHead=head;
        ListNode tail=null;
        ListNode newHead=null;
        while(currHead!=null){
            currHead=head;
            int count=0;
            while(currHead!=null && count<k){
                currHead=currHead.next;
                count++;
            }
            if(count==k){
                ListNode revHead=reverse(head,k);
                if(newHead==null) newHead=revHead;
                if(tail!=null) tail.next=revHead;
                tail=head;
                head=currHead;
            }
            if(tail!=null) tail.next=head;
        }
        return newHead==null?head:newHead;
    }
    public ListNode reverse(ListNode head,int k){
        ListNode curr=head;
        ListNode prev=null;
        while(curr!=null && k>0){
            ListNode temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
            k--;
        }
        return prev;
    }
}
