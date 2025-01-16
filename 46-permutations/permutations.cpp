class Solution {
public:
    void solve(vector<vector<int>>&ans,vector<int> &res,vector<int> nums,unordered_set<int> &used,int idx)
    {
        if(res.size()==nums.size())
        {
            ans.push_back(res);
            return;
        }

        for(int i=0;i<nums.size();i++)
        {
            if(used.find(nums[i])==used.end())
            {
                used.insert(nums[i]);
                res.push_back(nums[i]);
                solve(ans,res,nums,used,idx+1);
                used.erase(nums[i]);
                res.pop_back();
            }
        }
    }
    vector<vector<int>> permute(vector<int>& nums) 
    {    
        vector<vector<int>>ans;
        vector<int>res;
        unordered_set<int> used;

        solve(ans,res,nums,used,0);
        return ans;
    }
};