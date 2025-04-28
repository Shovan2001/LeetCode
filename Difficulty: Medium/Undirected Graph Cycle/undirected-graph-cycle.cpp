//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends

class Solution {
  public:
    // bool dfs_check_cycle(vector<vector<int>> &adj, unordered_set<int> &found,int node,int parent)
    // {
        
    //     found.insert(node);
        
    //     for(auto it: adj[node])
    //     {
    //         if(it==parent)
    //         continue;
            
    //         if(found.find(it)!=found.end())
    //         return true;
            
            
    //         if(dfs_check_cycle(adj,found,it,node))
    //         return true;
    //     }
        
    //     return false;
    // }
    
    
    bool bfs_check_cycle(vector<vector<int>> &adj, unordered_set<int> &found,int node,int parent)
    {
        queue<pair<int,int>>q;
        
        q.push({node,parent});
        found.insert(node);
        
        while(!q.empty())
        {
            pair<int,int>temp=q.front();
            q.pop();
            
            int temp_node=temp.first;
            int temp_parent=temp.second;
            
            for(auto it: adj[temp_node])
            {
                if(it==temp_parent)
                continue;
                
                if(found.find(it)!=found.end())
                return true;
                
                q.push({it,temp_node});
                found.insert(it);
                
            }
            
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
        
        //dfs
        // for(int i=0;i<V;i++)
        // {
        //     if(found.find(i)==found.end() && dfs_check_cycle(adj,found,i,-1))
        //     return true;
        // }
        
        
        //bfs
        for(int i=0;i<V;i++)
        {
            if(found.find(i)==found.end() && bfs_check_cycle(adj,found,i,-1))
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