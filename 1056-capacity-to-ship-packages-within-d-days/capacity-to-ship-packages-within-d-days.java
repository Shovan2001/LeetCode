class Solution {
    public int no_of_days_req_if_max_capacity_is_mid(int[] weights, int maxWeight)
    {
        int no_of_days=1,currWeight=weights[0];
        
        for(int i=1;i<weights.length;i++)
        {
            if(currWeight+weights[i]>maxWeight)
            {
                no_of_days++;
                currWeight=weights[i];
            }
            else
            currWeight+=weights[i];
        }
        
        return no_of_days;
    }
    public int shipWithinDays(int[] weights, int days) {
        int sum=0;
        for(int i=0;i<weights.length;i++)
        {
            sum+=weights[i];
        }
        int max=Arrays.stream(weights).max().getAsInt();

        int l=max,h=sum;
        
        while(l<h)
        {
            int mid=l+(h-l)/2;
            
            int no_of_days=no_of_days_req_if_max_capacity_is_mid(weights,mid);
            
            if(no_of_days>days)//then increase capacity per ship
            l=mid+1;
            else
            h=mid;
        }
        return l;
    }
}