class Solution {
    public int minElemPos(int nums[])
    {
        int l=0,h=nums.length-1;
        while(l<h)
        {
            //skip duplicates
            while(l<h && nums[l]==nums[l+1])
            l++;
            //skip duplicates
            while(l<h && nums[h]==nums[h-1])
            h--;
            int mid=l+(h-l)/2;
            if(nums[mid]>nums[h])
            l=mid+1;
            else
            h=mid;
        }
        return l;
    }
    public int advBinarySearch(int nums[],int low,int high,int target)
    {
        while(low<high)
        {
            int mid=low+(high-low)/2;

            if(nums[mid]<target)
            low=mid+1;
            else
            high=mid;
        }
        return low;
    }
    public boolean search(int[] nums, int target) {
        
        int pos_of_min_elem=minElemPos(nums);
        int pos;
        
        pos=advBinarySearch(nums,0,pos_of_min_elem-1,target);

        if(pos==pos_of_min_elem || nums[pos]!=target)
        {
            pos=advBinarySearch(nums,pos_of_min_elem,nums.length,target);
            if(pos==nums.length || nums[pos]!=target)
            return false;
            else
            return true;
        }
        return true;
    }
}