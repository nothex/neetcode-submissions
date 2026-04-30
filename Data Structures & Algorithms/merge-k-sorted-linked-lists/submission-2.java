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
    public ListNode mergeKLists(ListNode[] lists) {
    if(lists==null||lists.length==0) return null;
    return divide(lists,0,lists.length-1);
    }
    public ListNode divide(ListNode[] lists,int start,int end){
        if(start>end) return null;
        if(start==end) return lists[start];
        int mid=start+(end-start)/2;
        ListNode leftmerge=divide(lists,start,mid);
        ListNode rightmerge=divide(lists,mid+1,end);
        
        return merge(leftmerge,rightmerge);
    }

    public ListNode merge(ListNode l1,ListNode l2){
        ListNode curr=new ListNode(0);
        ListNode dummy=curr;
        while(l1!=null&&l2!=null){
            if(l1.val<=l2.val){
                curr.next=l1;
                l1=l1.next;
            }
            else {
                curr.next=l2;
                l2=l2.next;
            }
            curr=curr.next;
        }
        curr.next=(l1==null)?l2:l1;
        return dummy.next;
    }
}
/*  int len=lists.length;
    ListNode res=new ListNode(0);
    if(len==0) return null ;
    if(len==1) return lists[0];
    if(len>=2) 
    {
    res=merge(lists[0],lists[1]);
    for(int i=2;i<len;i++){
    res=merge(res,lists[i]);
    }
    }
    return res;
    }
    public ListNode merge(ListNode l1,ListNode l2){
        ListNode dummy=new ListNode(0);
        ListNode temp=dummy;
        while(l1!=null&&l2!=null){
            if(l1.val<=l2.val){
               temp.next=l1;
               l1=l1.next;
            }
            else if(l2.val<=l1.val){
                temp.next=l2;
                l2=l2.next;
            }
            temp=temp.next;
        }
        temp.next=(l1==null)?l2:l1;
        return dummy.next;
    }*/
