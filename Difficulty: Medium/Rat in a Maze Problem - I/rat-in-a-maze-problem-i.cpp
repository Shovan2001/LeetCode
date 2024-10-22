//{ Driver Code Starts
// Initial template for C++

#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends
// User function template for C++

class Solution {
  public:
    void solve(vector<vector<int>> &mat,vector<string> &ans,int row,int col,string op,int n)
    {
        if(row>=n || col>=n || row<0 || col<0 || mat[row][col]==0)
        return;
        
        if(row==n-1 && col==n-1)
        {
            ans.push_back(op);
            return;
        }
        
           
        mat[row][col]=0;
        
        solve(mat,ans,row-1,col,op+'U',n);
        solve(mat,ans,row+1,col,op+'D',n);
        solve(mat,ans,row,col-1,op+'L',n);
        solve(mat,ans,row,col+1,op+'R',n);
        
        mat[row][col]=1;
        
    }
    vector<string> findPath(vector<vector<int>> &mat) {
        // Your code goes here
        vector<string>ans;
        int n=mat.size();
        solve(mat,ans,0,0,"",n);
        return ans;
    }
};


//{ Driver Code Starts.

int main() {
    int t;
    cin >> t;
    while (t--) {
        int n;
        cin >> n;
        vector<vector<int>> m(n, vector<int>(n, 0));
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                cin >> m[i][j];
            }
        }
        Solution obj;
        vector<string> result = obj.findPath(m);
        sort(result.begin(), result.end());
        if (result.size() == 0)
            cout << -1;
        else
            for (int i = 0; i < result.size(); i++)
                cout << result[i] << " ";
        cout << endl;
    }
    return 0;
}
// } Driver Code Ends