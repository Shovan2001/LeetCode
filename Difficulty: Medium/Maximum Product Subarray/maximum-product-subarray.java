class Solution {
    int maxProduct(int[] arr) {
        // code here
        int front_to_end_pdt=1,end_to_front_pdt=1,n=arr.length;
        int front_to_end_pdt_max=Integer.MIN_VALUE,end_to_front_pdt_max=Integer.MIN_VALUE;
        int max_pdt=Integer.MIN_VALUE;
        
        for(int i=0;i<n;i++)
        {
            front_to_end_pdt*=arr[i];
            front_to_end_pdt_max=Math.max(front_to_end_pdt_max,front_to_end_pdt);
            
            end_to_front_pdt*=arr[n-1-i];
            end_to_front_pdt_max=Math.max(end_to_front_pdt_max,end_to_front_pdt);
            
            max_pdt=Math.max(front_to_end_pdt_max,end_to_front_pdt_max);
            
            if(front_to_end_pdt==0)
            front_to_end_pdt=1;
            if(end_to_front_pdt==0)
            end_to_front_pdt=1;
        }
        return max_pdt;
    }
}