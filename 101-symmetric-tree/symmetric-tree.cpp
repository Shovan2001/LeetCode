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
    TreeNode *invertTree(TreeNode *root)
    {
        if(root==NULL)
        return root;

        TreeNode *leftsub=invertTree(root->left);
        TreeNode *rightsub=invertTree(root->right);

        root->left=rightsub;
        root->right=leftsub;
        
        return root;
    }
    bool sameTree(TreeNode *p,TreeNode *q)
    {
        if(p==NULL && q==NULL)
        return true;

        if(p!=NULL && q!=NULL)
        {
            if(p->val!=q->val)
            return false;

            return (sameTree(p->left,q->left)&&sameTree(p->right,q->right));
        }
        return false;
    }
    bool isSymmetric(TreeNode* root) 
    {
        if(root==NULL)
        return true;
        //invert right sub tree
        invertTree(root->right);
        //check if same tree or not
        if(sameTree(root->left,root->right))
        return true;
        return false;
    }
};