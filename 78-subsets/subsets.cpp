class Solution {
public:
    void solve(vector<int>nums,vector<int> &sub,vector<vector<int>> &ans,int idx)
    {
        if(idx==nums.size())
        {
            ans.push_back(sub);
            return;
        }
        
        sub.push_back(nums[idx]);
        solve(nums,sub,ans,idx+1);
        sub.pop_back();

        solve(nums,sub,ans,idx+1);
        
    }
    vector<vector<int>> subsets(vector<int>& nums) 
    {
        vector<vector<int>>ans;
        vector<int>sub;
    
        solve(nums,sub,ans,0);
        return ans;
    }
};