/*
class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
*/
class Solution {
    public Node reverse(Node head) {
        // code here
        if(head==null || head.next==null)
        return head;
        
        Node curr=head;
        Node prev=null;
        
        while(curr!=null)
        {
            Node next=curr.next;
            
            curr.next=prev;
            curr.prev=next;
            
            prev=curr;
            curr=next;//curr.next
        }
        
        head=prev;
        return head;
    }
}