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
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode temp=dummy.next,prev=dummy;
        
        while(temp!=null){
            ListNode kth=kth(temp,k);
            if(kth==null){
                prev.next=temp;
                break;
            }
            ListNode save=kth.next;
            kth.next=null;
            
            ListNode revHead=reverse(temp);
            prev.next=revHead;
            temp.next=save;

            prev=temp;
            temp=save;
        }
        return dummy.next;
    }
    public ListNode reverse(ListNode head){
        ListNode curr=head;
        ListNode prev=null;
        while(curr!=null){
            ListNode temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        return prev;
    }
    public ListNode kth(ListNode head,int k){
        ListNode curr=head;
        while(curr!=null && k>1){
            curr=curr.next;
            k--;
            if(k==1) return curr;
        }
        return null;
    }

}
