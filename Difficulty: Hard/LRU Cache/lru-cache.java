class Node
{
    int key;
    int data;
    Node prev;
    Node next;
    
    Node(int key,int data)
    {
        this.key=key;
        this.data=data;
        prev=null;
        next=null;
    }
}
class LRUCache {
    
    static Map<Integer,Node> mp;
    static int capacity;
    static Node oldest,latest;
    
    LRUCache(int cap) {
        // code here
        capacity=cap;
        mp=new HashMap<>(capacity);
        oldest=new Node(0,0);
        latest=new Node(0,0);
        
        oldest.next=latest;
        latest.prev=oldest;
        
    }

    private static void insert(Node node)
    {
        Node secLast=latest.prev;
        secLast.next=node;
        node.prev=secLast;
        
        node.next=latest;
        latest.prev=node;
    }
    
    private static void remove(Node node)
    {
        Node prev1=node.prev;
        Node next1=node.next;
        
        prev1.next=next1;
        next1.prev=prev1;
    }
    
    public static int get(int key) {
        //  code here
        if(mp.containsKey(key))
        {
            Node node=mp.get(key);
            remove(node);
            insert(node);
            return node.data;
        }
        
        return -1;
    }

        
    public static void put(int key, int value) {
        //  code here
        if(mp.containsKey(key))
        {
            Node node=mp.get(key);
            remove(node);
            mp.remove(node.key);
        }
        
        if(mp.size()==capacity)
        {
            Node lruNode=oldest.next;
            remove(lruNode);
            mp.remove(lruNode.key);
        }
        
        Node newNode=new Node(key,value);
        insert(newNode);
        mp.put(key,newNode);
    }
}