class Solution {
    public int minJumps(int[] arr) {
        // code here
        if(arr.length==1)
        return 0;
        
        if(arr[0]==0)
        return -1;
        
        int jumps=1;
        int fathestReachablePoint=arr[0];
        int currentReachablePoint=arr[0];
        
        for(int i=1;i<arr.length;i++)
        {
            if(i>=arr.length-1)
            return jumps;
            
            fathestReachablePoint=Math.max(fathestReachablePoint,i+arr[i]);
            
            if(i==currentReachablePoint)
            {
                jumps++;
                currentReachablePoint=fathestReachablePoint;
            }
            
            if(i>=fathestReachablePoint)
            return -1;
        }
        
        return -1;
    }
}