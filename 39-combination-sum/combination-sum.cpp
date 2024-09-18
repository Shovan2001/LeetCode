class Solution {
public:
    // void helper(vector<vector<int>>&ans,vector<int> &subans,vector<int> &candidates,int index,int target)
    // {
    //     if(index==candidates.size())
    //     {
    //         if(target==0)
    //             ans.push_back(subans);
    //         return;
    //     }
        
    //     if(candidates[index]<=target){
    //     subans.push_back(candidates[index]);
    //     //idx not changed to idx+1 as same number can be chosen multiple times
    //     helper(ans,subans,candidates,index,target-candidates[index]);
    //     subans.pop_back();
    //     }
        
    //     helper(ans,subans,candidates,index+1,target);
        
    // }
    void solve(vector<vector<int>>&ans,vector<int>&res,vector<int>nums,int idx,int target)
    {
        if(idx==nums.size())
        {
            if(target==0)
                ans.push_back(res);
            return;
        }
        // vector<int>op1=res;
        // vector<int>op2=res;

        if(nums[idx]<=target)
        {
            res.push_back(nums[idx]);
            solve(ans,res,nums,idx,target-nums[idx]);
            res.pop_back();
        }
        solve(ans,res,nums,idx+1,target);
        
    }
    vector<vector<int>> combinationSum(vector<int>& candidates, int target) 
    {
        vector<vector<int>>ans;
        vector<int>res;
        solve(ans,res,candidates,0,target);
        return ans;

        // vector<vector<int>>ans;
        // vector<int>subans;
        // helper(ans,subans,candidates,0,target);
        // return ans;
        
    }
};