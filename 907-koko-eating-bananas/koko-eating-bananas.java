class Solution {
    int findmax(int piles[])
    {
        int max=piles[0];
        for(int i=1;i<piles.length;i++)
        {
            if(piles[i]>max)
            max=piles[i];
        }
        return max;
    } 
    int findmin(int piles[])
    {
        int min=piles[0];
        for(int i=1;i<piles.length;i++)
        {
            if(piles[i]<min)
            min=piles[i];
        }
        return min;
    } 
    int canfinishinhours(int piles[],int rate)
    {
        int tot_time=0;
        for(int i=0;i<piles.length;i++)
        {
            tot_time+=Math.ceil((double)piles[i]/rate);
        }
        return tot_time;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        if (h < n) {
            return -1;
        }
        int low=1;
        int high=findmax(piles);
        
        int ans;
        while(low<high)
        {
            int mid=low+(high-low)/2;

            int hours_needed=canfinishinhours(piles,mid);

            if(hours_needed<=h)
            high=mid;
            else
            low=mid+1;
        }
        return low;
    }
}