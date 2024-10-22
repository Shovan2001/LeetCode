class Solution {
public:
    int findMinElem(vector<int>& nums)
    {
        int l=0,h=nums.size()-1;
        while(l<h)
        {
            if(nums[l]<nums[h])
            return l;
            
            int mid=l+(h-l)/2;

            if(nums[l]<=nums[mid])
            l=mid+1;
            else
            h=mid;
        }
        return l;
    }
    int advancedBinSearch(vector<int>& nums,int l,int h,int x)
    {
        //int l=0,h=nums.size();
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
    int search(vector<int>& nums, int target) 
    {
        int l;
        int min_elem_idx=findMinElem(nums);
        
        if(target<=nums[nums.size()-1])
        l=advancedBinSearch(nums,min_elem_idx,nums.size(),target);
        //cout<<"Hi";
        else
        l=advancedBinSearch(nums,0,min_elem_idx-1,target);
        
        if(l==nums.size() || nums[l]!=target)
        return -1;

        return l;
    }
};