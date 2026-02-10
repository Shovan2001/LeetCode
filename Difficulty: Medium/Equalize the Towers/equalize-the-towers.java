class Solution {
    public int findCostToMakeAllTowersHeightX(int heights[],int cost[],int x)
    {
        int tot_cost=0;
        
        for(int i=0;i<heights.length;i++)
        {
            tot_cost+=cost[i]*Math.abs(x-heights[i]);
        }
        
        return tot_cost;
    }
    public int minCost(int[] heights, int[] cost) {
        // code here
        
        int mini=Arrays.stream(heights).min().getAsInt();
        int maxi=Arrays.stream(heights).max().getAsInt();
        
        int l=mini,h=maxi;
        
        while(l<h)
        {
            int mid=l+(h-l)/2;
            
            int cost1=findCostToMakeAllTowersHeightX(heights,cost,mid-1);
            int cost2=findCostToMakeAllTowersHeightX(heights,cost,mid);
            int cost3=findCostToMakeAllTowersHeightX(heights,cost,mid+1);
            
            if(cost2<cost1 && cost2<cost3)
            return cost2;
            
            if(cost2<cost1)
            l=mid+1;
            else
            h=mid;
        }
        
        return findCostToMakeAllTowersHeightX(heights,cost,l);
    }
}
