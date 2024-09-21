//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;



// } Driver Code Ends
/*You are required to complete this method */

class Solution
{
    public:
    
    void solve(vector<int>persons , int k , int index , int &ans)
    {
        if(persons.size()==1)
        {
            ans=persons[0];
            return;
        }
        
        index=(index+k)%persons.size();
        
        persons.erase(persons.begin()+index);
        
        solve(persons,k,index,ans);
    }
    int josephus(int n, int k)
    {
       //Your code here
       if(n==1)
       return n;
       
       k=k-1;
       
       vector<int>persons;
       
       for(int i = 1 ; i <= n ; i++)
       {
           persons.push_back(i);
       }
       
       int index = 0 , ans = -1;
       
       solve(persons , k , index , ans);
       
       return ans;
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