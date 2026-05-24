class Solution {
    public int getMinCoins(int coins[],int idx,int amt,int memo[][])
    {
        if(idx==coins.length)
        return (int)1e9;

        if(amt==0)
        return 0;

        if(memo[idx][amt]!=-1)
        return memo[idx][amt];

        if(coins[idx]<=amt)
        {
            memo[idx][amt]=Math.min(1+getMinCoins(coins,idx,amt-coins[idx],memo),
                                        getMinCoins(coins,idx+1,amt,memo));
            return Math.min(1+getMinCoins(coins,idx,amt-coins[idx],memo),
                                        getMinCoins(coins,idx+1,amt,memo));
        }
        else
        {
            memo[idx][amt]= getMinCoins(coins,idx+1,amt,memo);
            return getMinCoins(coins,idx+1,amt,memo);
        }
    }

    public int coinChange(int[] coins, int amount) {

        int[][] memo = new int[coins.length][amount + 1];
        for (int[] row : memo) 
        Arrays.fill(row, -1);
        
        int ans=getMinCoins(coins,0,amount,memo);
        
        return ans>=(int)1e9?-1:ans;
    }
}