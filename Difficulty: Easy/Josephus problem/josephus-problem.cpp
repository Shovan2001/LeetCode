//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;



// } Driver Code Ends
/*You are required to complete this method */

class Solution
{
    public:
    int solve(vector<int> &nums,int n,int k,int idx)
    {
        if(nums.size()==1)
        return nums[0];
        
        idx=(idx+k)%nums.size();
        
        nums.erase(nums.begin()+idx);
        
        solve(nums,n,k,idx);
    }
    int josephus(int n, int k)
    {
       //Your code here
       vector<int>nums;
       k=k-1;
       for(int i=1;i<=n;i++)
       nums.push_back(i);
       
       return solve(nums,n,k,0);
        
    }
};



//{ Driver Code Starts.

int main() {
	
	int t;
	cin>>t;//testcases
	while(t--)
	{
		int n,k;
		cin>>n>>k;//taking input n and k
		
		//calling josephus() function
		Solution ob;
		cout<<ob.josephus(n,k)<<endl;
	}
	return 0;
}
// } Driver Code Ends