class Solution {
    public int coin(int[] arr) {
        // code here
        int s=0,e=arr.length-1;
        
        while(s<e)
        {
            if(arr[s]>arr[e])
            s++;
            else
            e--;
        }
        return arr[s];
    }
}