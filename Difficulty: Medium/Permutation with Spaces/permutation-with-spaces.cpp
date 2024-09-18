//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends
class Solution {
  public:
    void solve(vector<string>&ans,string s,string op,int idx)
    {
        if(idx==s.length())
        {
            ans.push_back(op);
            return;
        }
        
        string op1=op;
        string op2=op;
        
        op1+=' ';
        op1+=s[idx];
        solve(ans,s,op1,idx+1);
        
        op2+=s[idx];
        solve(ans,s,op2,idx+1);
        
    }
    vector<string> permutation(string s) 
    {
        // Code Here
        vector<string>ans;
        string op="";
        op+=s[0];
        s.erase(s.begin()+0);
        solve(ans,s,op,0);
        return ans;
    }
};

//{ Driver Code Starts.

int main() {
    int t;
    cin >> t;
    while (t--) {
        string S;
        cin >> S;
        vector<string> ans;
        Solution obj;
        ans = obj.permutation(S);
        for (int i = 0; i < ans.size(); i++) {
            cout << "(" << ans[i] << ")";
        }
        cout << endl;
    }
}

// } Driver Code Ends