//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends

class Solution {
  public:
    bool dfs_check_cycle(vector<vector<int>> &adj, unordered_set<int> &found,int node,int parent)
    {
        // if(found.find(node)!=found.end())
        // return false;
        
        found.insert(node);
        
        for(auto it: adj[node])
        {
            if(it==parent)
            continue;
            
            if(found.find(it)!=found.end())
            return true;
            
            
            if(dfs_check_cycle(adj,found,it,node))
            return true;
            
        }
        
        return false;
    }
    
    bool isCycle(int V, vector<vector<int>>& edges) {
        // Code here
        vector<vector<int>> adj(V);
        
        for(int i=0;i<edges.size();i++)
        {
            int u=edges[i][0];
            int v=edges[i][1];
            
            adj[u].push_back(v);
            adj[v].push_back(u);
            
        }
        
        unordered_set<int>found;
        
        for(int i=0;i<V;i++)
        {
            if(found.find(i)==found.end() && dfs_check_cycle(adj,found,i,-1))
            return true;
        }
        return false;
    }
};


//{ Driver Code Starts.

int main() {
    int tc;
    cin >> tc;
    cin.ignore();
    while (tc--) {
        int V, E;
        cin >> V >> E;
        cin.ignore();
        vector<vector<int>> edges;
        for (int i = 1; i <= E; i++) {
            int u, v;
            cin >> u >> v;
            edges.push_back({u, v});
        }

        Solution obj;
        bool ans = obj.isCycle(V, edges);
        if (ans)
            cout << "true\n";
        else
            cout << "false\n";

        cout << "~"
             << "\n";
    }
    return 0;
}

// } Driver Code Ends