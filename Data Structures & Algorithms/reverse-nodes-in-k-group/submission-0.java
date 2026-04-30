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
    ListNode groups=dummy.next;
    ListNode groupp=dummy;
    while(groups!=null){
        ListNode kth=kth(groups,k);
        if(kth==null){
            groupp.next=groups;
            break;
        }
        ListNode start_of_next_group=kth.next;
        kth.next=null;
        
        ListNode newHeadgroup=rev(groups);
        groupp.next=newHeadgroup;
        groups.next=start_of_next_group;

        groupp=groups;
        groups=start_of_next_group;
    }
    return dummy.next;
    }

    public ListNode kth(ListNode node,int k){
        int count=0;
        ListNode dummy=node;
        ListNode temp=dummy;
        while(temp!=null){
            temp=temp.next;
            count++;
            if(count==k-1) return temp;
            
        }
        return null;
    }
    public ListNode rev(ListNode start){
        ListNode curr=start;
        ListNode temp=null;
        ListNode prev=null;
        while(curr!=null){
            temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        return prev;
    }
}
