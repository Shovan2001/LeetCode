class Solution {
    public int time_taken(int arr[],int rate)
    {
        int time=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%rate!=0)
            time+=(arr[i]/rate)+1;
            
            else
            time+=(arr[i]/rate);
        }
        
        return time;
    }
    public int kokoEat(int[] arr, int k) {
        // code here
        int l=1,h=Arrays.stream(arr).max().getAsInt();
                
        while(l<h)
        {
            int mid=l+(h-l)/2;
            
            int hours_taken=time_taken(arr,mid);
            
            if(hours_taken>k)
            l=mid+1;
            else
            h=mid;
        }
        
        return l;
    }
}
