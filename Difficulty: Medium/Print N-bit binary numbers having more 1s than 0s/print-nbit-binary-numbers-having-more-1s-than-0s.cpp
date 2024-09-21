//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends
//User function template for C++
class Solution{
public:	
    
    void solve(vector<string>&ans,int n,int zero,int one,string op)
    {
        if(op.length()==n)
        {
            ans.push_back(op);
            return;
        }
        
        op+="1";
        solve(ans,n,zero,one+1,op);
        op.pop_back();
        
        if(one>zero)
        {
            op+="0";
            solve(ans,n,zero+1,one,op);
            op.pop_back();
        }
    }
	vector<string> NBitBinary(int n)
	{
	    // Your code goes here
	    int zero=0,one=0;
	    vector<string>ans;
	    solve(ans,n,zero,one,"");
	
	    return ans;
	}
};

//{ Driver Code Starts.

int main() 
{
   	

   	ios_base::sync_with_stdio(0);
    cin.tie(NULL);
    cout.tie(NULL);
   
   	int t;
   	cin >> t;
   	while(t--)
   	{
   		int n;
   		cin >> n;
        Solution ob;
   		vector<string> ans = ob.NBitBinary(n);

   		for(auto i:ans)
   			cout << i << " ";

   		cout << "\n";
   	}

    return 0;
}
// } Driver Code Ends