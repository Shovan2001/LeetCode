class Solution {
    public int solve(int W,int val[],int wt[],int idx,int memo[][])
    {
        if(W==0)
        return 0;
        
        if(idx==wt.length)
        return 0;
        
        if(memo[idx][W]!=-1)
        return memo[idx][W];
        
        if(wt[idx]<=W)
        {
            //take
            //not_take
            memo[idx][W]=Math.max(val[idx]+solve(W-wt[idx],val,wt,idx+1,memo),
                            solve(W,val,wt,idx+1,memo));
            return Math.max(val[idx]+solve(W-wt[idx],val,wt,idx+1,memo),
                            solve(W,val,wt,idx+1,memo));
        }
        else
        {
            //not_take
            memo[idx][W]=solve(W,val,wt,idx+1,memo);
            return solve(W,val,wt,idx+1,memo);
        }
    }
    public int knapsack(int W, int val[], int wt[]) {
        // code here
        
        int memo[][]=new int[wt.length][W+1];
        
        for(int row[]:memo)
        Arrays.fill(row,-1);
        
        int ans=solve(W,val,wt,0,memo);
        return ans;
    }
}
