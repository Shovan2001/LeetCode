class Solution {
    public int maxWater(int arr[]) {
        // Code Here
        int l=0,h=arr.length-1;
        int maxWaterContained=Integer.MIN_VALUE;
        
        while(l<=h)
        {
            int waterContained=Math.min(arr[l],arr[h])*(h-l);
            
            if(arr[l]<arr[h])
            l++;
            else
            h--;
            
            maxWaterContained=Math.max(waterContained,maxWaterContained);
        }
        return maxWaterContained;
    }
}