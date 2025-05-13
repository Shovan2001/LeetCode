//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends


class Solution {
  public:
    // Function to calculate the minimum number of operations required.
    long minOperations(vector<int> arr) {
        // code here
        int n=arr.size();
        
        int sum=0;
        for(int i=0;i<n;i++)
        sum+=arr[i];
        
        if(sum%n!=0)
        return -1;
        
        int target=sum/n;
        
        int c=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>target)
            c+=arr[i]-target;
            if(arr[i]<target)
            c+=target-arr[i];
        }
        return c/2;
    }
};


//{ Driver Code Starts.

int main() {
    string ts;
    getline(cin, ts);
    int t = stoi(ts);

    while (t--) {
        string line;
        getline(cin, line);
        stringstream ss(line);
        vector<int> nums;
        int num;
        while (ss >> num) {
            nums.push_back(num);
        }
        Solution ob;
        cout << ob.minOperations(nums) << endl;
        cout << "~" << endl;
    }
    return 0;
}

// } Driver Code Ends