class Solution {
    public int hrs_needed_to_finish_with_rate_mid(int[] arr, int x) 
    {
        int time=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%x==0)
            time+=arr[i]/x;
            else
            time+=(arr[i]/x)+1;
        }
        return time;
    }
    
    public int kokoEat(int[] arr, int k) {
        // code here
        
        int mini=1;//Arrays.stream(arr).min().getAsInt();
        int maxi=Arrays.stream(arr).max().getAsInt();
        
        // if(k<)
        
        int l=mini,h=maxi;
        
        while(l<h)
        {
            int mid=l+(h-l)/2;
            
            int hrs_needed=hrs_needed_to_finish_with_rate_mid(arr,mid);
            
            if(hrs_needed>k)
            l=mid+1;
            else
            h=mid;
        }
        return l;
    }
}
