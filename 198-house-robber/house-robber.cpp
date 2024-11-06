class Solution {
public:
    int solve(vector<int>& nums, int idx,int robcurrhouse, int skipcurrhouse,
                unordered_map<int,int> &mp)
    {
        if(idx>=nums.size())
        return 0;

        if(mp.find(idx)!=mp.end())
        return mp[idx];

        robcurrhouse=nums[idx]+solve(nums,idx+2,robcurrhouse,skipcurrhouse,mp);

        skipcurrhouse=solve(nums,idx+1,robcurrhouse,skipcurrhouse,mp);

        mp[idx]=max(robcurrhouse,skipcurrhouse);
        
        return mp[idx]; 

    }
    int rob(vector<int>& nums) 
    {
        unordered_map<int,int>mp;
        return solve(nums,0,0,0,mp); 
    }
};