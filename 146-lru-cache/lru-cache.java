class Node
{
    int data;
    int val;
    Node prev;
    Node next;

    Node(int data,int val)
    {
        this.data=data;
        this.val=val;
        this.prev=null;
        this.next=null;
    }
}
class LRUCache {

    Map<Integer,Node> mp;
    int cap;
    Node first,last;

    public LRUCache(int capacity) {
        
        cap=capacity;
        mp=new HashMap<>(cap);
        first=new Node(0,0);
        last=new Node(0,0);
        first.next=last;
        last.prev=first;
    }
    private void remove(Node node)
    {
        Node prev1=node.prev;
        Node next1=node.next;

        prev1.next=next1;
        next1.prev=prev1;
    }
    private void insert(Node node)
    {
        Node secLast=last.prev;
        last.prev=node;
        node.next=last;
        
        node.prev=secLast;
        secLast.next=node;

    }
    public int get(int key) {

        if(mp.containsKey(key))
        {
            Node node=mp.get(key);
            remove(node);
            insert(node);
            return node.val;
        }

        return -1;
    }
    
    public void put(int key, int value) {

        if(mp.containsKey(key))
        {
            Node node=mp.get(key);
            remove(node);
            mp.remove(key);
        }

        if(mp.size()==cap)
        {
            Node lru=first.next;
            remove(lru);
            mp.remove(lru.data);
        }
        Node newNode=new Node(key,value);
        mp.put(key,newNode);
        insert(newNode);
    }
}
//TLE
// class LRUCache {

//     List<int[]> l=null;
//     int n;
//     public LRUCache(int capacity) {
//         n=capacity;
//         l=new ArrayList<>(n);
//     }
    
//     public int get(int key) {

//         for(int i=0;i<l.size();i++)
//         {
//             int f=l.get(i)[0];            
//             int s=l.get(i)[1];
            
//             if(f==key)
//             {
//                 int arr[]=l.get(i);
//                 l.remove(i);
//                 l.add(arr);
//                 return s;
//             }
//         }
//         return -1;
//     }
    
//     public void put(int key, int value) {

//         for(int i=0;i<l.size();i++)
//         {
//             int f=l.get(i)[0];            
            
//             if(f==key)
//             {
//                 l.remove(i);
//                 l.add(new int[]{key,value});
//                 return;
//             }
//         }

//         if(l.size()==n)
//         l.remove(0);

//         l.add(new int[]{key,value});
//     }
// }

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */