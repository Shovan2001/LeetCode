/*
class Node{
    int data;
    Node left, right;
    Node(int d){
        data=d;
        left=right=null;
    }
}
*/

class Solution {
    
    int max_sum=Integer.MIN_VALUE;
    int findMaxSum(Node root) {
        // code here
        findMaxSumHelper(root);
        
        return max_sum;
    }
    
    int findMaxSumHelper(Node root)
    {
        if(root==null)
        return 0;
        
        int left_sum=Math.max(0,findMaxSumHelper(root.left));
        int right_sum=Math.max(0,findMaxSumHelper(root.right));
        
        int curr_sum=left_sum+right_sum+root.data;
        
        max_sum=Math.max(max_sum,curr_sum);
        
        return Math.max(left_sum,right_sum)+root.data;
    }
}