class Solution {
    public int getMinDiff(int[] arr, int k) {
        // code here
        int n=arr.length;
        
        if(n==1)
        return 0;
        
        Arrays.sort(arr);
        
        int smallest=arr[0];
        int largest=arr[n-1];
        
        int diff=arr[n-1]-arr[0];
        
        for(int i=1;i<n;i++)
        {
            
            smallest=Math.min(arr[0]+k,arr[i]-k);
            largest=Math.max(arr[i-1]+k,arr[n-1]-k);
            
            if(smallest<0)
            continue;
            
            diff=Math.min(diff,largest-smallest);
        }
        return diff;
    }
}
