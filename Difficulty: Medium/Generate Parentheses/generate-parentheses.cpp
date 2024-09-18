//{ Driver Code Starts
//Initial Template for C++

#include <bits/stdc++.h>
using namespace std;
vector<string> AllParenthesis(int n) ;


// } Driver Code Ends
//User function Template for C++

// N is the number of pairs of parentheses
// Return list of all combinations of balanced parantheses
class Solution
{
    public:
    void solve(vector<string>&ans,int open,int close,string op)
    {
        if(open==0 && close==0)
        {
            ans.push_back(op);
            return;
        }
        if(open!=0)
        {
            op+='(';
            solve(ans,open-1,close,op);
            op.pop_back();
        }
        if(close>open)
        {
            op+=')';
            solve(ans,open,close-1,op);
        }
    }
    vector<string> AllParenthesis(int n) 
    {
        // Your code goes here 
        int open=n,close=n;
        vector<string>ans;
        solve(ans,open,close,"");
        return ans;
    }
};

//{ Driver Code Starts.


int main() 
{ 
	int t;
	cin>>t;
	while(t--)
	{
		int n;
		cin>>n;
		Solution ob;
		vector<string> result = ob.AllParenthesis(n); 
		sort(result.begin(),result.end());
		for (int i = 0; i < result.size(); ++i)
			cout<<result[i]<<"\n";
	}
	return 0; 
} 

// } Driver Code Ends