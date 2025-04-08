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
    TreeNode *flatten_bt_to_ll(TreeNode* root)
    {
        if(root==NULL)
        return NULL;

        TreeNode *head1=flatten_bt_to_ll(root->left);
        root->left=NULL;
        // if(head1!=NULL)
        // root->right=head1;

        TreeNode *head2=flatten_bt_to_ll(root->right);
        
        if(head1!=NULL)
        {
            TreeNode* temp=head1;

            while(temp!=NULL && temp->right!=NULL)
            temp=temp->right;

            root->right=head1;
            temp->right=head2;
        }
        else
            root->right=head2;

        return root;
    }

    void flatten(TreeNode* root) 
    {
        // if(root==NULL)
        // return;

        flatten_bt_to_ll(root);
        // flatten(root->right);
        
    }
};