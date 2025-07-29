class Solution {
    public int noOfPersonReqIfMaxAPersonCanHoldIsMid(int arr[],int pagesPerPerson)
    {
        int person=1,holdingPages=arr[0];
        
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]+holdingPages>pagesPerPerson)
            {
                person++;
                holdingPages=arr[i];
            }
            else
            holdingPages+=arr[i];
        }
        return person;
    }
    public int findPages(int[] arr, int k) {
        // code here
        if(arr.length<k)
        return -1;
        
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
        }
        int max=Arrays.stream(arr).max().getAsInt();
        
        
        int l=max,h=sum;
        
        while(l<h)
        {
            int mid=l+(h-l)/2; //no of pages per person
            
            int person=noOfPersonReqIfMaxAPersonCanHoldIsMid(arr,mid);
            
            if(person>k)
            l=mid+1;
            else
            h=mid;
        }
        
        return l;
    }
}