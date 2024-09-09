class Solution {
public:
    int firstMissingPositive(vector<int>& nums) 
    {
        int maxi=1;
        for(int i=0;i<nums.size();i++)
        maxi=max(maxi,nums[i]);

        unordered_set<int>s;
        for(int i=0;i<nums.size();i++)
        s.insert(nums[i]);

        for(int i=1;i<=maxi;i++)
        {
            if(s.find(i)==s.end())
            return i;
        }
        cout<<maxi;
        return maxi+1;
    }
};