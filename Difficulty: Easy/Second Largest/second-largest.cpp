//{ Driver Code Starts
#include <bits/stdc++.h>

using namespace std;


// } Driver Code Ends

class Solution {
  public:
    int getSecondLargest(vector<int> &arr) {
        // code here
        if(arr.size()<2)
        return -1;
        int maxi=INT_MIN;
        int low_maxi=-1;
        for(int i=0;i<arr.size();i++)
        {
            if(arr[i]>maxi)
                maxi=arr[i];
            
        }
        
        for(int i=0;i<arr.size();i++)
        {
            if(arr[i]>low_maxi && arr[i]!=maxi)
            low_maxi=arr[i];
        }
      return low_maxi;
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
        Solution ob;
        int ans = ob.getSecondLargest(arr);
        cout << ans << endl;
        cout << "~" << endl;
    }
    return 0;
}

// } Driver Code Ends