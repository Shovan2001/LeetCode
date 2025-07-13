class Solution {
    public int findMin(int[] nums) {
        int h=nums.length;
        int l=0,r=h-1;

        while(l<r)
        {
            int mid=l+(r-l)/2;

            if(nums[mid]>nums[r])
            l=mid+1;
            else
            r=mid;
        }
        return nums[l];
    }
}