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
    string tree2str(TreeNode* root) 
    {
        if(root==NULL)
        return "";

        string ans="";
        ans+=to_string(root->val);

        if(root->left==NULL && root->right==NULL)
        return ans;
        
        string leftpart=tree2str(root->left);
        string rightpart=tree2str(root->right);

        if(root->left==NULL)
        {
            return ans+"()"+"("+rightpart+")";
        }
        
        if(root->right==NULL)
        {
            return ans+"("+leftpart+")";
        }
        
        return ans+"("+leftpart+")"+"("+rightpart+")";
    }
};