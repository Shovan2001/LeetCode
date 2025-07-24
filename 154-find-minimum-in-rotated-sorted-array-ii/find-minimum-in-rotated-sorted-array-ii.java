class Solution {
    public int findMin(int[] nums) 
    {
        int l=0,h=nums.length-1;

        while(l<h)
        {

            while(l<h && nums[l]==nums[l+1])
            l++;

            while(l<h && nums[h]==nums[h-1])
            h--;
            
            int mid=l+(h-l)/2;

            if(nums[mid]>nums[h])
            l=mid+1;
            else //if(nums[mid]<nums[h])
            h=mid;
            // else
            // h--;
        }
        return nums[l];
    }
}