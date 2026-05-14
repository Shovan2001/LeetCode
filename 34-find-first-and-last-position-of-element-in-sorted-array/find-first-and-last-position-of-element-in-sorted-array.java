class Solution {
    public int advBinSearch(int nums[],int target)
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
        return l;
    }
    public int[] searchRange(int[] nums, int target) {
        
        int l=advBinSearch(nums,target);
        System.out.println(l);
        if(l==nums.length || nums[l]!=target)
        return new int[]{-1,-1};

        int h=advBinSearch(nums,target+1);
        System.out.println(h);
        // if(h==nums.length || nums[h-1]!=target)
        // return new int[]{-1,-1};
        
        // else
        return new int[]{l,h-1};
    }
}