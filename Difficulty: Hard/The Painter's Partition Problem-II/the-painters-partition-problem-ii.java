// User function Template for Java

class Solution {
    public int noOfPPaintersReqIfMaxAPainterCanColorIsMid(int arr[],int MaxlengthOfWall)
    {
        int painters=1,wallColored=arr[0];
        
        for(int i=1;i<arr.length;i++)
        {
            if(wallColored+arr[i]>MaxlengthOfWall)
            {
                painters++;
                wallColored=arr[i];
            }
            else
            wallColored+=arr[i];
        }
        
        return painters;
    }
    public int minTime(int[] arr, int k) {
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
            
            int painters=noOfPPaintersReqIfMaxAPainterCanColorIsMid(arr,mid);
            
            if(painters>k)
            l=mid+1;
            else
            h=mid;
        }
        return l;
    }
}
