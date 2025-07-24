class Solution {
  public:
    int single(vector<int>& arr) {
        // code here
        // if(arr.size()==1)
        // return arr[0];
        
        int l=0,h=arr.size()-1;
        
        while(l<=h)
        {
            int mid=l+(h-l)/2;
            
            if ((mid == 0 || arr[mid] != arr[mid - 1]) &&
                (mid == arr.size() - 1 || arr[mid] != arr[mid + 1])) 
            {
                return arr[mid];
            }
            
            //1st one in pair
            if (mid > 0 && arr[mid] == arr[mid - 1]) 
            mid--;
            
            int no_of_elem_to_left = mid - l;
    
            if (no_of_elem_to_left % 2 == 0)
                l = mid + 2;
            else
                h = mid - 1;
        }
        return arr[l];
    }
};