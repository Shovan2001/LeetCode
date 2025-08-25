class Solution {
    public int findFloor(int[] arr, int x) {
        // code here
        int l=0,h=arr.length;
        
        while(l<h)
        {
            int mid=l+(h-l)/2;
            
            if(arr[mid]<x+1)
            l=mid+1;
            else
            h=mid;
        }
        //while()
        return l-1;
    }
}
