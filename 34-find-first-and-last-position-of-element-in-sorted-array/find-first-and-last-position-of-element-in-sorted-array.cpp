class Solution {
public:
    int advancedBinarySearch(vector<int>& nums, int target)
    {
        int l=0,h=nums.size();
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
    vector<int> searchRange(vector<int>& nums, int target) 
    {
        int l=advancedBinarySearch(nums,target);
        
        if(l==nums.size() || nums[l]!=target)// && h!=nums.size()-1)
        return {-1,-1};
        
        int h=advancedBinarySearch(nums,target+1);
        return {l,h-1};        
    }
};