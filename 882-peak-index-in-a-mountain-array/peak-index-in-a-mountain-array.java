class Solution {
    public int peakIndexInMountainArray(int[] arr) 
    {
        int l=0,h=arr.length;

        while(l<h)
        {
            int mid=l+(h-l)/2;

            if(arr[mid-1]<arr[mid])
            l=mid+1;
            else
            h=mid;
        }
        return l-1;
    }
}