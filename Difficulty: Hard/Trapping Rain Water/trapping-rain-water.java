class Solution {
    public int[] left_max(int arr[])
    {
        int left_max[]=new int[arr.length];
        left_max[0]=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            left_max[i]=Math.max(left_max[i-1],arr[i]);
        }
        return left_max;
    }
    
    public int[] right_max(int arr[])
    {
        int right_max[]=new int[arr.length];
        right_max[arr.length-1]=arr[arr.length-1];
        for(int i=arr.length-2;i>=0;i--)
        {
            right_max[i]=Math.max(right_max[i+1],arr[i]);
        }
        return right_max;
    }
    public int maxWater(int arr[]) {
        // code here
        int left_max[]=left_max(arr);
        int right_max[]=right_max(arr);
        
        int water=0;
        for(int i=0;i<arr.length;i++)
        {
            water+=Math.min(left_max[i],right_max[i])-arr[i];
        }
        
        return water;
    }
}
