class Solution {
public:
    void solve(set<vector<int>> &ans,vector<int>&res,vector<int>&nums,int idx)
    {
        if(idx==nums.size())
        {
            ans.insert(res);
            return;
        }
    
        res.push_back(nums[idx]);
        solve(ans,res,nums,idx+1);
        res.pop_back();

        solve(ans,res,nums,idx+1);
    }
    vector<vector<int>> subsetsWithDup(vector<int>& nums) 
    {
        set<vector<int>>ans;
        vector<int>res;

        sort(nums.begin(),nums.end());
        solve(ans,res,nums,0);
        vector<vector<int>>ans1(ans.begin(),ans.end());
        return ans1;
        
    }
};