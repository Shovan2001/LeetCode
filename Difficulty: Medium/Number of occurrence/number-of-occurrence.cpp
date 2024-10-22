//{ Driver Code Starts
#include<bits/stdc++.h>

using namespace std;


// } Driver Code Ends
//User function template for C++
class Solution{
public:	
	/* if x is present in arr[] then returns the count
		of occurrences of x, otherwise returns 0. */
	int advancedBinSearch(int arr[],int n,int x)
	{
	    int l=0,h=n;
	    while(l<h)
	    {
	        int mid=l+(h-l)/2;
	        
	        if(arr[mid]<x)
	        l=mid+1;
	        else
	        h=mid;
	    }
	    return l;
	}
	int count(int arr[], int n, int x) {
	    // code here
	    int l=advancedBinSearch(arr,n,x);
	    
	    if(l==n || arr[l]!=x)
	    return 0;
	    
	    int h=advancedBinSearch(arr,n,x+1);
	    
	    return h-l;
	}
};

//{ Driver Code Starts.

int main() {
    int t;
    cin >> t;
    while (t--) {
        int n, x;
        cin >> n >> x;
        int arr[n];
        for (int i = 0; i < n; i++) {
            cin >> arr[i];
        }
        Solution ob;
        auto ans = ob.count(arr, n, x);
        cout << ans << "\n";
    }
    return 0;
}

// } Driver Code Ends