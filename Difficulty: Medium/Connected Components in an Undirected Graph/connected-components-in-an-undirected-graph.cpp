//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends


class Solution {
  public:
    void dfs(vector<vector<int>> &adj_list,vector<int> &component,unordered_set<int> &found,int node)
    {
        // if(found.find(node)!=found.end())
        // return;
        
        component.push_back(node);
        found.insert(node);
        
        for(auto it:adj_list[node])
        {
            if(found.find(it)==found.end())
            dfs(adj_list,component,found,it);
        }
    }
    vector<vector<int>> getComponents(int V, vector<vector<int>>& edges) {
        // code here
        vector<vector<int>>adj_list(V);
        
        for(int i=0;i<edges.size();i++)
        {
            int u=edges[i][0];
            int v=edges[i][1];
            
            adj_list[u].push_back(v);
            adj_list[v].push_back(u);
        }
        
        vector<vector<int>>ans;
        unordered_set<int>found;
        
        for(int i=0;i<V;i++)
        {
            if(found.find(i)==found.end())
            {
                vector<int>component;
                dfs(adj_list,component,found,i);
            
                ans.push_back(component);
            }
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
        vector<vector<int>> res = obj.getComponents(V, edges);

        for (int i = 0; i < res.size(); i++) {
            sort(res[i].begin(), res[i].end());
        }
        sort(res.begin(), res.end());
        for (const auto &component : res) {
            for (int node : component) {
                cout << node << " ";
            }
            cout << endl;
        }
        cout << "~"
             << "\n";
    }
    return 0;
}

// } Driver Code Ends