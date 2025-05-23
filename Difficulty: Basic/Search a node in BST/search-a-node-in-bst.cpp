//{ Driver Code Starts
#include <bits/stdc++.h>

using namespace std;

struct Node {
    int data;
    Node *right;
    Node *left;

    Node(int x) {
        data = x;
        right = NULL;
        left = NULL;
    }
};

bool search(Node *root, int x);

Node *insert(Node *tree, int val) {
    Node *temp = NULL;
    if (tree == NULL) return new Node(val);

    if (val < tree->data) {
        tree->left = insert(tree->left, val);
    } else if (val > tree->data) {
        tree->right = insert(tree->right, val);
    }

    return tree;
}

int main() {
    int T;
    cin >> T;
    while (T--) {
        Node *root = NULL;

        int N;
        cin >> N;
        for (int i = 0; i < N; i++) {
            int k;
            cin >> k;
            root = insert(root, k);
        }

        int s;
        cin >> s;

        cout << search(root, s);
        cout << endl;
    
cout << "~" << "\n";
}
}

// } Driver Code Ends


// Function to search a node in BST.
bool search(Node* root, int x) {
    // Your code here
    if(root==NULL)
    return false;
    
    if(root->data==x)
    return true;
    
    if(x>root->data)
    {
        bool right=search(root->right,x);
        if(right==false)
        return false;
        return true;
    }
    else
    {
        bool left=search(root->left,x);
        if(left==false)
        return false;
        return true;
    }
    return false;
}
