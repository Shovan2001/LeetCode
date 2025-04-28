//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends

class Solution {
  public:
    bool dfs_check_cycle(vector<vector<int>> &adj, unordered_set<int> &found,int node,unordered_set<int> &found_in_current_recursion)
    {
        
        found.insert(node);
        found_in_current_recursion.insert(node);
    
        for(auto it :adj[node])
        {
            //if not found and dfs returns true
            if(found.find(it)==found.end() && dfs_check_cycle(adj,found,it,found_in_current_recursion))
            return true;
            
            //if found and 
            if(found.find(it)!=found.end() && found_in_current_recursion.find(it)!=found_in_current_recursion.end())
            return true;
            
        }
        found_in_current_recursion.erase(node);
        return false;
    }
    bool isCyclic(int V, vector<vector<int>> &edges) {
        // code here
        vector<vector<int>> adj(V);
        
        for(int i=0;i<edges.size();i++)
        {
            int u=edges[i][0];
            int v=edges[i][1];
            
            adj[u].push_back(v);
            // adj[v].push_back(u);
        }
        
        unordered_set<int>found;
        unordered_set<int>found_in_current_recursion;
        
        for(int i=0;i<V;i++)
        {
            if(found.find(i)==found.end() && dfs_check_cycle(adj,found,i,found_in_current_recursion))
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
        bool ans = obj.isCyclic(V, edges);
        if (ans)
            cout << "true\n";
        else
            cout << "false\n";
    }
    return 0;
}
// } Driver Code Ends