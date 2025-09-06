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
    Node mergeTwoSortedLL(Node first,Node second)
    {
        Node curr1=first,curr2=second;
        Node dummy=new Node(-1);
        Node ans=dummy;
        
        while(curr1!=null && curr2!=null)
        {
            if(curr1.data<curr2.data)
            {
                ans.next=curr1;
                curr1=curr1.next;
            }
            else
            {
                ans.next=curr2;
                curr2=curr2.next;
            }
            
            ans=ans.next;
        }
        
        // System.out.println(ans.data);
        // System.out.println(curr1.data);
        // System.out.println(curr2.data);
        if(curr1!=null)
        ans.next=curr1;
        else
        ans.next=curr2;
        
        return dummy.next;
    }
    Node mergeKLists(Node[] arr) {
        // code here
        Node merged=arr[0];
        
        for(int i=1;i<arr.length;i++)
        {
            merged=mergeTwoSortedLL(merged,arr[i]);
        }
        
        return merged;
    }
}