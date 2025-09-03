/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/
class Solution {
    public Node swapKth(Node head, int k) {
        // code here
        if (head == null || k <= 0) 
        return head; 
        
        Node temp=head;
        int size=0;
        while(temp!=null)
        {
            size++;
            temp=temp.next;
        }
        
        if (k > size)
        return head;
        
        
        Node curr=head;
        // Node prev=null;
        Node pos1=null;
        int x=0;
        while(curr!=null)
        {
            x++;
            if(x==k)
            {
                pos1=curr;
                break;
            }
            
            // prev=curr;
            curr=curr.next;
        }
        // System.out.println(prev1.data);
        // System.out.println(pos1.data);
        curr=head;
        // Node next=null;
        Node pos2=null;
        int k1=size-k+1;
        while(curr!=null)
        {
            if(k1==1)
            {
                pos2=curr;
                break;
            }
            k1--;
            curr=curr.next;
        }
        // next=pos2.next;
        
        
        int tempVal=pos1.data;
        pos1.data=pos2.data;
        pos2.data=tempVal;
        
        
        // System.out.println(prev.data);
        // System.out.println(pos1.data);
        // System.out.println(pos2.data);
        // System.out.println(next.data);
        //if(prev!=null)
        // {
            // prev.next=pos2;
            // pos2.next=pos1.next;
        // }
        // if(next!=null)
        // {
        //     prev.next=next;
        // }
        
        // System.out.println(pos2.data);
        // System.out.println(next.data);
        // if(pos1!=null)
        // pos1.next=pos2;
        
        // if(pos2!=null)
        // pos2.next=pos1;
        
        // Node temp2=pos1.next;
        // pos1.next=pos2.next;
        // pos2.next=temp2;
        
        // if(k==1)
        // head=pos2;
        
        // if(k==size)
        // head=pos1;
        
        // return head;
        
        // System.out.println(pos1.data);
        // System.out.println(pos2.data);
        
        return head;
    }
}
