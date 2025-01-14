//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends
// User function template for C++

class Solution {
  public:
    void solve(vector<vector<int>> &mat,vector<string>& ans,string op,int row,int col,int n)
    {
        if(row==n || col==n || row<0 ||col<0 || mat[row][col]==0)
        return;
        
        if(row==n-1 && col==n-1)
        {
            ans.push_back(op);
            return;
        }
        
        mat[row][col]=0;
        
        solve(mat,ans,op+'U',row-1,col,n);
        solve(mat,ans,op+'D',row+1,col,n);
        solve(mat,ans,op+'L',row,col-1,n);
        solve(mat,ans,op+'R',row,col+1,n);
        
        mat[row][col]=1;
    }
    vector<string> findPath(vector<vector<int>> &mat) 
    {
        // code here
        vector<string>ans;
        int n=mat.size();
        solve(mat,ans,"",0,0,n);
        return ans;
    }
};


//{ Driver Code Starts.

int main() {
    int t;
    cin >> t;
    cin.ignore();
    while (t--) {
        string input;
        getline(cin, input);
        vector<vector<int>> mat;
        string innerArray;
        bool isInsideArray = false;

        for (char c : input) {
            if (c == '[') {
                if (isInsideArray) {
                    innerArray.clear();
                }
                isInsideArray = true;
            } else if (c == ']') {
                if (isInsideArray && !innerArray.empty()) {
                    vector<int> row;
                    stringstream ss(innerArray);
                    int num;

                    while (ss >> num) {
                        row.push_back(num);
                        if (ss.peek() == ',')
                            ss.ignore();
                        while (isspace(ss.peek()))
                            ss.ignore();
                    }

                    mat.push_back(row);
                    innerArray.clear();
                }
                isInsideArray = false;
            } else if (isInsideArray) {
                if (!isspace(c)) {
                    innerArray += c;
                }
            }
        }

        Solution obj;
        vector<string> result = obj.findPath(mat);
        sort(result.begin(), result.end());

        if (result.empty())
            cout << "[]";
        else
            for (int i = 0; i < result.size(); i++)
                cout << result[i] << " ";
        cout << endl;
        cout << "~" << endl;
    }
    return 0;
}

// } Driver Code Ends