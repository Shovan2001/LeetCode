class Solution {
    public int calculateNoOfSubarraysReqMaxSumOfASubArrayIsMid(int arr[],int maxSum)
    {
        int currSum=arr[0];
        int noOfArraysReq=1;
        for(int i=1;i<arr.length;i++)
        {
            if(currSum+arr[i]>maxSum)
            {
                currSum=arr[i];
                noOfArraysReq++;
            }
            else
            currSum+=arr[i];
        }
        return noOfArraysReq;
    }
    public int splitArray(int[] nums, int k) {

        int l=Arrays.stream(nums).max().getAsInt();
        int h=Arrays.stream(nums).sum();

        while(l<h)
        {
            int mid=l+(h-l)/2;

            int no_of_subarrays=calculateNoOfSubarraysReqMaxSumOfASubArrayIsMid(nums,mid);
            
            if(no_of_subarrays>k)
            l=mid+1;
            else
            h=mid;
        }
        return l;
    }
}