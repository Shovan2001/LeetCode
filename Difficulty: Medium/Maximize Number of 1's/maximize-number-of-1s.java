class Solution {
    public int maxOnes(int arr[], int k) {
        // code here
        int l=0,r=0,z=0;
        int len=0;
        //1. move to the rightmost point which can be reached till no of 0's >k
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==0)
            z++;
            
            r=i;
            
            while(z>k)
            {
                if(arr[l]==0)
                z--;
                
                l++;
            }
            
            len=Math.max(len,r-l+1);
        }
        return len;
    }
}