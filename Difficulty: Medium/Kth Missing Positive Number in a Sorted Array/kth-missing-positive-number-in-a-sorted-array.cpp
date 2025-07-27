class Solution {
  public:
    int kthMissing(vector<int> &arr, int k) {
        // code here
        int l=0,h=arr.size();
        // int no_of_missing_elem_left=0;
        
        while(l<h)
        {
            int mid=l+(h-l)/2;
            
            int no_of_missing_elem_left=arr[mid]- /*actual arr[i]*/(mid+1);
            
            if(no_of_missing_elem_left<k)
                l=mid+1;
            else
                h=mid;
        }
        return l+k;
    }
};