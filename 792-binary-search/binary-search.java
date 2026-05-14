class Solution {
    public int search(int[] nums, int target) 
    {
        int l=0,h=nums.length;
        
        while(l<h)
        {
            int mid=l+(h-l)/2;

            if(nums[mid]<target)
            l=mid+1;
            else
            h=mid;
        }
        if(l<nums.length && nums[l]==target)
        return l;
        else
        return -1;
    }
}