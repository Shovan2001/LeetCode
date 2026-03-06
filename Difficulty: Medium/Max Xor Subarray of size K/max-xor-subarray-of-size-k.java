class Solution {
    public int maxSubarrayXOR(int[] arr, int k) {
        // code here
        int xor_k=0;
        for(int i=0;i<k;i++)
        {
            xor_k^=arr[i];
        }
        
        int max_xor=xor_k;
        for(int i=k;i<arr.length;i++)
        {
            xor_k^=arr[i-k];
            xor_k^=arr[i];
            max_xor=Math.max(max_xor,xor_k);
        }
        return max_xor;
    }
}
