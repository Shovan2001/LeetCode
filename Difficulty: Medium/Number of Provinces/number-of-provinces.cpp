//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends

// User function Template for C++

class Solution {
  public:
    void dfs(vector<vector<int>> &adj_list,unordered_set<int> &found,vector<int> &component,int node)
    {
        found.insert(node);
        component.push_back(node);
        
        for(auto it:adj_list[node])
        {
            if(found.find(it)==found.end())
            dfs(adj_list,found,component,it);
        }
    }
    
    int numProvinces(vector<vector<int>> adj, int V) {
        // code here
        vector<vector<int>>adj_list(V+1);
        adj_list.erase(adj_list.begin() + 0);
        
        for(int i=0;i<adj.size();i++)
        {
            for(int j=0;j<adj[i].size();j++)
            {
                if(adj[i][j]==1)
                {
                    if(i!=j)
                    adj_list[i+1].push_back(j+1);
                }
            }
        }
        
        vector<vector<int>>ans;
        unordered_set<int>found;
        
        for(int i=1;i<=V;i++)
        {
            if(found.find(i)==found.end())
            {
                vector<int>component;
                dfs(adj_list,found,component,i);
            
                ans.push_back(component);
            }
            
        }
        
        return ans.size();
    }
};


//{ Driver Code Starts.

int main() {
    int t;
    cin >> t;
    while (t--) {
        int V,x;
        cin>>V;
        
        vector<vector<int>> adj;
        
        for(int i=0; i<V; i++)
        {
            vector<int> temp;
            for(int j=0; j<V; j++)
            {
                cin>>x;
                temp.push_back(x);
            }
            adj.push_back(temp);
        }
        

        Solution ob;
        cout << ob.numProvinces(adj,V) << endl;
    
cout << "~" << "\n";
}
    return 0;
}
// } Driver Code Ends