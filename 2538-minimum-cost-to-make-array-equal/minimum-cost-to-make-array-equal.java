class Solution {
    public long costRequiredToMakeAllElementsMid(int nums[],int cost[],long newElem)
    {
        long totCost=0;
        for(int i=0;i<nums.length;i++)
        {
            totCost+=Math.abs(newElem-nums[i])*cost[i];
        }
        return totCost;
    }
    public long minCost(int[] nums, int[] cost) 
    {
        long l=Arrays.stream(nums).min().getAsInt();
        long h=Arrays.stream(nums).max().getAsInt();
        
        while(l<h)
        {
            long mid=l+(h-l)/2;

            long totCost=costRequiredToMakeAllElementsMid(nums,cost,mid);
            long totCostForNextElem=costRequiredToMakeAllElementsMid(nums,cost,mid+1);
            
            if(totCost>totCostForNextElem)
                l=mid+1;
            else
                h=mid;
        }

        long finalAns=costRequiredToMakeAllElementsMid(nums,cost,l);

        return finalAns;
    }
}