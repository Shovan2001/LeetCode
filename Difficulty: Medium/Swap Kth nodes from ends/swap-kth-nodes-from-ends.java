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
        // if head is null OR k is -ve no point in swapping
        if (head == null || k <= 0) 
        return head; 
        
        //CALCULATE SIZE OF LINKED LIST
        Node temp=head;
        int size=0;
        while(temp!=null)
        {
            size++;
            temp=temp.next;
        }
        
        // if K>SIZE no point in swapping
        if (k > size)
        return head;
        
        
        Node curr=head;
        // LOCATING KTH NODE START
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
            
            curr=curr.next;
        }
        
        curr=head;
        // LOCATING KTH NODE FROM END
        Node pos2=null;
        int k1=size-k;
        while(curr!=null)
        {
            if(k1==0)
            {
                pos2=curr;
                break;
            }
            k1--;
            curr=curr.next;
        }
        
        //SWAP THEIR DATA
        int tempVal=pos1.data;
        pos1.data=pos2.data;
        pos2.data=tempVal;
        
        // RETURN THE HEAD
        return head;
    }
}
