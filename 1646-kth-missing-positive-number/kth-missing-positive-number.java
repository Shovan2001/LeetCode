class Solution {
    public int findKthPositive(int[] arr, int k) {
        
        int currNo=1;
        int i=0;
        while(k>0)
        {
            // System.out.println(currNo);
            
            if(i>=arr.length)
            {
                k--;
                currNo++;
                i++;
            }
            else if(currNo!=arr[i])
            {
                k--;
                currNo++;
            }
            else
            {
                currNo++;
                i++;
            }
        }
        return currNo-1;
    }
}