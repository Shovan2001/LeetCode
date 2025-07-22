class Solution {
    public int solve(List<Integer> l,int currIdx,int k)
    {
        if(l.size()==1)
        return l.get(0);

        int rmvIdx=(currIdx+k)%l.size();
        l.remove(rmvIdx);
        
        return solve(l,rmvIdx,k);
    }
    public int findTheWinner(int n, int k) {

        k=k-1;
        k%=n;
        
        List<Integer> l =new ArrayList<>();

        for(int i=0;i<n;i++)
        {
            l.add(i);
        }
        
        int x=solve(l,0,k);

        return x+1;
    }
}