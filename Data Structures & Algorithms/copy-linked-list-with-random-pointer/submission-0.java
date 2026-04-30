/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head==null) return null;
        Node temp=head;
        while(temp!=null){
            Node copy=new Node(temp.val);
            copy.next=temp.next;
            temp.next=copy;
            temp=temp.next.next;
        }
        temp=head;
        while(temp!=null){
            temp.next.random=(temp.random==null)?null:temp.random.next;
            temp=temp.next.next;
        }
        Node orig=head;
        Node copy=head.next;
        Node res=head.next;
        while(copy!=null){
            orig.next=copy.next;
            copy.next=(orig.next==null)?null:orig.next.next;
            copy=copy.next;
            orig=orig.next;
        }
        return res;
    }
}
