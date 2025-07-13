// User function Template for Java

class Solution {
    static int largestPrimeFactor(int n) {
        // code here
        if(n==2)
        return 2;
        
        List<Integer> l=new ArrayList<>();
        for(int i=2;i<=n;i++)
        {
            if(n%i==0)
            {
                l.add(i);
                n/=i;
                i--;
            }
        }
        
        return l.get(l.size()-1);
    }
}