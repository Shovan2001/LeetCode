class Solution {
    public int minElemPos(int nums[])
    {
        int l=0,h=nums.length-1;
        while(l<h)
        {
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
    public int search(int[] nums, int target) {

        int pos_of_min_elem=minElemPos(nums);
        int pos;
        if(target<=nums[nums.length-1])
            pos=advBinarySearch(nums,pos_of_min_elem,nums.length,target);
        else
            pos=advBinarySearch(nums,0,pos_of_min_elem-1,target);
        
        if(pos==nums.length || nums[pos]!=target)
        return -1;
        else
        return pos;

    }
}