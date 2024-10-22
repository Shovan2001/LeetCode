//{ Driver Code Starts

#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends
class Solution {
  public:
    int advancedBinSearch(vector<int> &arr,int x)
    {
        int l=0,h=arr.size();
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
    vector<int> find(vector<int> arr, int x) {
        // code here
        //int l=0,h=arr.size();
        
        int l=advancedBinSearch(arr,x);
        
        if(l==arr.size() || arr[l]!=x)
        return {-1,-1};
        
        int h=advancedBinSearch(arr,x+1);
    
        return {l,h-1};
    }
};

//{ Driver Code Starts.

int main() {

    int t;
    cin >> t;
    cin.ignore();
    while (t--) {
        vector<int> arr;
        string input;
        getline(cin, input);
        stringstream ss(input);
        int number;
        while (ss >> number) {
            arr.push_back(number);
        }
        int x;
        cin >> x;
        cin.ignore();
        vector<int> ans;
        Solution ob;
        ans = ob.find(arr, x);
        cout << ans[0] << " " << ans[1] << endl;
    }
    return 0;
}

// } Driver Code Ends