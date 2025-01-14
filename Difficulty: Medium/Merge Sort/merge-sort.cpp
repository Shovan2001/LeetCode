//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends
class Solution {
  public:
  
    void mergearrays(vector<int>& arr,int low,int mid,int high)
    {
        vector<int> res;
        int left=low,right=mid+1;
        
        while(left<=mid && right<=high)
        {
            if(arr[left]<=arr[right])
            {
                res.push_back(arr[left]);
                left++;
            }
            else
            {
                res.push_back(arr[right]);
                right++;
            }
        }
        while(left<=mid)
        {
            res.push_back(arr[left]);
            left++;
        }
        while(right<=high)
        {
            res.push_back(arr[right]);
            right++;
        }
        
        for(int i=low;i<=high;i++)
        arr[i]=res[i-low];
    }
    void mergeSort(vector<int>& arr, int l, int r) {
        // code here
        
        if(l>=r)
        return;
        
        int mid=l+(r-l)/2;
        
        mergeSort(arr,l,mid);
        mergeSort(arr,mid+1,r);
        mergearrays(arr,l,mid,r);
    }
};

//{ Driver Code Starts.

int main() {
    string ts;
    getline(cin, ts);
    int t = stoi(ts);
    while (t--) {
        vector<int> arr;
        string input;
        getline(cin, input);
        stringstream ss(input);
        int number;
        while (ss >> number) {
            arr.push_back(number);
        }
        Solution obj;
        obj.mergeSort(arr, 0, arr.size() - 1);
        for (int i = 0; i < arr.size(); i++) {
            cout << arr[i] << " ";
        }
        cout << endl;
        cout << "~" << endl;
    }
    return 0;
}

// } Driver Code Ends