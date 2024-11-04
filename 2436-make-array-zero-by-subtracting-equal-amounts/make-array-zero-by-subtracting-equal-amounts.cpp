class Solution {
public:
    int minimumOperations(vector<int>& nums) 
    {
        unordered_set<int>ans(nums.begin(),nums.end());
        ans.erase(0);
        return ans.size();
        
    }
};