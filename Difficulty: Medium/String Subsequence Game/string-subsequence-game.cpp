//{ Driver Code Starts
// Initial Template for C++
#include <bits/stdc++.h>
using namespace std;

// } Driver Code Ends
// User function Template for C++
class Solution {
  public:
    bool check(char ch)
    {
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
        return true;
        
        return false;
    }
    void solve(set<string>&s,string S,string op,int idx)
    {
        if(idx==S.length())
        {
            if(op.length()>=1 && check(op[0]) && !check(op[op.length()-1]))
            s.insert(op);
            return;
        }
        
        // string op1=op;
        // string op2=op;
        
        op+=S[idx];
        solve(s,S,op,idx+1);
        op.pop_back();
        solve(s,S,op,idx+1);
        
    }
    set<string> allPossibleSubsequences(string S) 
    {
        // code here
        set<string>s;
        string op="";
        solve(s,S,op,0);
        
        return s;
    }
};

//{ Driver Code Starts.
int main() {
    int t;
    cin >> t;
    while (t--) {
        string S;
        cin >> S;
        Solution ob;
        set<string> ans = ob.allPossibleSubsequences(S);
        if (ans.size() == 0)
            cout << -1 << endl;
        else {
            for (auto i : ans) cout << i << " ";
            cout << endl;
        }
    }
    return 0;
}

// } Driver Code Ends