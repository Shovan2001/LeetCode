class Solution {
    public int searchInsertK(int arr[], int k) {
        // code here
        int l=0,h=arr.length;
        
        while(l<h)
        {
            int mid=l+(h-l)/2;
            
            if(arr[mid]<k)
            l=mid+1;
            else
            h=mid;
        }
        //while()
        return l;
    }
};