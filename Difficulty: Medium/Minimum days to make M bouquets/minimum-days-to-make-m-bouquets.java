class Solution {
    public int calculateNoOfBouquetsIfDayIsMid(int arr[],int flowersPerBouquet,int day)
    {
        int flowers=0,adj_flowers=0;
        int bouquets=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<=day)
            flowers++;
            if(arr[i]>day || i==arr.length-1)
            {
                adj_flowers=flowers;
                flowers=0;
                bouquets+=adj_flowers/flowersPerBouquet;
            }
        }
        return bouquets;
    }
    public int minDaysBloom(int[] arr, int k, int m) {
        // code here
        if(m>arr.length/k)  // m*k<=arr.length then only possible
        return -1;
        
        int l=Arrays.stream(arr).min().getAsInt(),h=Arrays.stream(arr).max().getAsInt();
        
        while(l<h)
        {
            int mid=l+(h-l)/2;
            
            int no_of_bouquets=calculateNoOfBouquetsIfDayIsMid(arr,k,mid);
            
            if(no_of_bouquets<m)
            l=mid+1;
            else
            h=mid;
        }
        return l;
    }
}