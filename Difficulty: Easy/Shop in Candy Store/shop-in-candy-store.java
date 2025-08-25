class Solution {
    public ArrayList<Integer> minMaxCandy(int[] prices, int k) {
        // code here
        Arrays.sort(prices);
        
        //find min price
        int min_amt=0,n=prices.length;
        for(int i=0;i<n;i++)
        {
            min_amt+=prices[i];
            //if(i==0)
            n-=k;
        }
        
        //find max price
        int max_amt=0,min=0;
        for(int i=prices.length-1;i>=min;i--)
        {
            max_amt+=prices[i];
            //if(i==prices.length-1)
            min+=k;
        }
        
        ArrayList<Integer> ans=new ArrayList<>();
        ans.add(min_amt);
        ans.add(max_amt);
    
        return ans;
    }
}
