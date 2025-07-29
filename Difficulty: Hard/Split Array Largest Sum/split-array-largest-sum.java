class Solution {
    public int no_of_subarrays_if_max_sum_is_mid(int []arr,int maxSum)
    {
        int no_of_subarrays=1,currSum=arr[0];
        
        for(int i=1;i<arr.length;i++)
        {
            if(currSum+arr[i]>maxSum)
            {
                no_of_subarrays++;
                currSum=arr[i];
            }
            else
            currSum+=arr[i];
        }
        
        return no_of_subarrays;
    }
    public int splitArray(int[] arr, int k) {
        // code here
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
        }
        int max=Arrays.stream(arr).max().getAsInt();
        
        int l=max,h=sum;
        
        while(l<h)
        {
            int mid=l+(h-l)/2;
            
            int no_of_subarrays=no_of_subarrays_if_max_sum_is_mid(arr,mid);
            
            if(no_of_subarrays>k)
            l=mid+1;
            else
            h=mid;
        }
        return l;
    }
};