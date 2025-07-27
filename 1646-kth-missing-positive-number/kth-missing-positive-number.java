class Solution {
    public int findKthPositive(int[] arr, int k) {
        
        int currNo=1;
        int i=0;
        while(k>0)
        {
            if(i>=arr.length)
            {
                k--;
                i++;
            }
            else if(currNo!=arr[i])
            {
                k--;
            }
            else
            {
                i++;
            }
            currNo++;
        }
        return currNo-1;
    }
}