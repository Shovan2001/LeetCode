class Solution {
public:
    int advancedBinSearch(vector<int>& nums,int x)
    {
        int l=0, h=nums.size();
        while(l<h)
        {
            int mid=l+(h-l)/2;
            if(nums[mid]<x)
            l=mid+1;
            else
            h=mid;
        }
        return l;
    }
    int searchInsert(vector<int>& nums, int target) 
    {
        int l=advancedBinSearch(nums,target);

        return l;
        
    }
};