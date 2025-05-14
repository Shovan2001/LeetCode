//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends


class Solution {
  public:
    void dfs_traversal(vector<vector<int>>& adj,vector<int> &ans,unordered_set<int> &found, int node)
    {
        ans.push_back(node);
        found.insert(node);
        
        for(auto it : adj[node])
        {
            if(found.find(it)==found.end())
            {
                dfs_traversal(adj,ans,found,it);
            }
        }
    }
    vector<int> dfs(vector<vector<int>>& adj) {
        // Code here
        vector<int>ans;
        unordered_set<int>found;
        
        for(int i=0;i<adj.size();i++)
        {
            if(found.find(i)==found.end())
            dfs_traversal(adj,ans,found,i);
        }
        
        return ans;
        
    }
};




//{ Driver Code Starts.

int main() {
    int tc;
    cin >> tc;
    cin.ignore();
    while (tc--) {
        int V;
        cin >> V;
        cin.ignore();
        vector<vector<int>> adj(
            V); // Use vector of vectors instead of array of vectors.

        for (int i = 0; i < V; i++) {
            string input;
            getline(cin, input);
            int num;
            vector<int> node;
            stringstream ss(input);
            while (ss >> num) {
                node.push_back(num);
            }
            adj[i] = node;
        }

        Solution obj;
        vector<int> ans = obj.dfs(adj);
        for (int i = 0; i < ans.size(); i++) {
            cout << ans[i] << " ";
        }
        cout << endl;
        cout << "~" << endl;
    }
    return 0;
}

// } Driver Code Ends