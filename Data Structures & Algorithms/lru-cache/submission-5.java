class LRUCache {
    HashMap<Integer,Node> map;
    int capacity;
    Node head,tail;
    public LRUCache(int capacity) {
        map=new HashMap<>();
        this.capacity=capacity;
        head=new Node(0,0);
        tail=new Node(0,0);
        head.next=tail;
        tail.prev=head;
    }
    
    public int get(int key) {
        if(!map.containsKey(key)) return -1;
        else{
            Node node=map.get(key);
            delete(node);
            insert(node);
            return node.val;
        }
    }
    
    public void put(int key, int value) {
        if(capacity<=0) return ;
        if(map.containsKey(key)){
            Node node=map.get(key);
            node.val=value;
            delete(node);
            insert(node);
            return;
        }
        if(map.size()==capacity){
            Node node=tail.prev;
            map.remove(node.key);
            delete(node);
        }
        Node newnode=new Node(key,value);
        map.put(key,newnode);
        insert(newnode);
    }
    public void delete(Node node){
        node.prev.next=node.next;
        node.next.prev=node.prev;
    }
    public void insert(Node node){
        node.next=head.next;
        head.next.prev=node;

        head.next=node;
        node.prev=head;
    }
}
class Node{
    int key,val;
    Node next,prev;
    Node(int key,int val){
        this.key=key;
        this.val=val;
    }
}
