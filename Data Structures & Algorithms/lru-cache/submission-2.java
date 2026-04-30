class LRUCache {
    
    public class DLL{
    int val,key;
    DLL next,prev;
    DLL(int key,int val){
        this.key=key;
        this.val=val;
        this.next=null;
        this.prev=null;
    }
    }
    int capacity;
    HashMap<Integer,DLL> map;
    DLL head,tail;
    public  LRUCache(int capacity) {
        this.capacity=capacity;
        this.map=new HashMap<>();
        this.head=new DLL(-1,-1);
        this.tail=new DLL(-1,-1);
        this.head.next=this.tail;
        this.tail.prev=this.head;
    }
    public void delete(DLL node){
    DLL previous_node=node.prev;
    DLL next_node=node.next;

    previous_node.next=next_node;
    next_node.prev=previous_node;
    }
    public void Insert_After_Head(DLL node){
    DLL curr=head.next;
    head.next=node;

    node.prev=head;
    node.next=curr;
    curr.prev=node;
    }
    
    public int get(int key) {
        if(!map.containsKey(key)) return -1;
        else {
        DLL node=map.get(key);
        delete(node);
        Insert_After_Head(node);
        return node.val;
        }
    }
    
    public void put(int key, int value) {
        if(this.capacity<=0) return;
        
        if(map.containsKey(key)){
            DLL node=map.get(key);
            node.val=value;
            delete(node);
            Insert_After_Head(node);
        }
        else {
        if(capacity==map.size()){
            DLL node=tail.prev;
            map.remove(node.key);
            delete(node);
        }
            DLL newNode=new DLL(key,value);
            map.put(key,newNode);
            Insert_After_Head(newNode);
        }
    }
}
