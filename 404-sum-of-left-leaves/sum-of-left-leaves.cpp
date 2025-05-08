/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    void help(TreeNode* root,bool flag,int &sum){
	//return 0 if root is null
        if(root==NULL){
            return;
        }
        if(root->left==NULL&&root->right==NULL&&flag){
            sum=sum+root->val; //adding only when both left & right are null and flag is true
        }
        help(root->left,true,sum);
        help(root->right,false,sum);
    }
    
    int sumOfLeftLeaves(TreeNode* root) {
        
        int sum=0;
        help(root,false,sum);
        return sum; //initially the flag is false 
    }
};