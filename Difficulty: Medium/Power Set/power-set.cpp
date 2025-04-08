//{ Driver Code Starts
#include<bits/stdc++.h>
using namespace std;

// } Driver Code Ends

class Solution{
	public:
	    void solve(vector<string> &ans,string op,string s,int idx)
	    {
	        if(idx==s.length())
	        {
	            ans.push_back(op);
	            return;
	        }
	        
	        solve(ans,op+s[idx],s,idx+1);
	        solve(ans,op,s,idx+1);
	        
	    }
		vector<string> AllPossibleStrings(string s){
		    // Code here
		    vector<string>ans;
		    solve(ans,"",s,0);
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

	
cout << "~" << "\n";
}
	return 0;
}
// } Driver Code Ends