class Solution {
  public:
  
    int findMinElem(vector<int> &arr)
    {
        int l=0,h=arr.size()-1;
        
        while(l<h)
        {
            int mid=l+(h-l)/2;
            
            if(arr[mid]>arr[h])
            l=mid+1;
            else
            h=mid;
        }
        return l;
    }
    int findKRotation(vector<int> &arr) {
        // Code Here
        int pos=findMinElem(arr);
        
        int rotation=pos;
        
        return rotation;
    }
};
