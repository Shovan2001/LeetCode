class Solution {
    public boolean isValidMax(int arr[],int expMax)
    {
        long nums[]=new long[arr.length];

        for(int i=0;i<arr.length;i++)
        {
            nums[i]=arr[i];
        }

        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]>expMax)
            return false;

            long buffer=expMax-nums[i];
            // nums[i]+=buffer;
            nums[i+1]-=buffer;
        }
        if(nums[nums.length-1]>expMax)
        return false;
        else
        return true;
    }
    public int minimizeArrayValue(int[] nums) 
    {
        int maxi=Arrays.stream(nums).max().getAsInt();
        int l=nums[0],h=maxi;
        while(l<h)
        {
            int mid=l+(h-l)/2;

            if(!isValidMax(nums,mid))
            l=mid+1;
            else
            h=mid;
        }
        return l;
    }
    // BRUTE FORCE (TLE)
    // public int posOfMaxi(int nums[],int n,int maxi)
    // {
    //     int i;
    //     for(i=0;i<n;i++)
    //     {
    //         if(nums[i]==maxi)
    //         break;
    //     }
    //     return i;
    // }
    // public int minimizeArrayValue(int[] nums) 
    // {
    //     int maxi=Arrays.stream(nums).max().getAsInt();
    //     int n=nums.length;
    //     while(nums[0]!=maxi)
    //     {
    //         int pos=posOfMaxi(nums,n,maxi);
            
    //         nums[pos]=nums[pos]-1;
    //         nums[pos-1]=nums[pos-1]+1;
            
    //         maxi=Arrays.stream(nums).max().getAsInt();
            
    //     }
    //     return nums[0];
        
    // }
}