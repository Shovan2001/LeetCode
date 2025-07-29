class Solution {
    public int findKthPositive(int[] arr, int k) {
        
        int l=0,h=arr.length;

        while(l<h)
        {
            int mid=l+(h-l)/2;
            int no_which_should_have_been_present=mid+1;
            int no_which_is_present=arr[mid];
            int no_of_missing_nos=no_which_is_present-no_which_should_have_been_present;
            if(no_of_missing_nos<k)
            l=mid+1;
            else
            h=mid;
        }
        //so l now denotes a position where no of missing nos to left is <=k
        return l+k;
    }
}