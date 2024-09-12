//{ Driver Code Starts
#include<bits/stdc++.h>
using namespace std;

// } Driver Code Ends
class Solution{
	public:
	    void solve(vector<string> &ans,string ip,string op)
	    {
	        if(ip.length()==0)
	        {
	            if(op.length()!=0)
	            ans.push_back(op);
	            return;
	        }
	        
	        string op1=op;
	        string op2=op;
	        
	        op2+=ip[0];
	        ip.erase(ip.begin()+0);
	        
	        solve(ans,ip,op1);
	        solve(ans,ip,op2);
	    }
		vector<string> AllPossibleStrings(string s)
		{
		    // Code here
		    string op="";
		    vector<string>ans;
		    solve(ans,s,op);
		    sort(ans.begin(),ans.end());
		    return ans;
		}
};

//{ Driver Code Starts.
int main(){
	int tc;
	cin >> tc;
	while(tc--){
		string s;
		cin >> s;
		Solution ob;
		vector<string> res = ob.AllPossibleStrings(s);
		for(auto i : res)
			cout << i <<" ";
		cout << "\n";

	}
	return 0;
}
// } Driver Code Ends