class Solution {
public:
    // void solve(vector<vector<int>>&ans,vector<int>&prem,vector<int> nums,int freq[])
    // {
    //     if(prem.size()==nums.size())
    //     {
    //         ans.push_back(prem);
    //         return;
    //     }
        
    //     for(int i=0;i<nums.size();i++)
    //     {
    //         if(freq[i]==0)
    //         {
    //             prem.push_back(nums[i]);
    //             freq[i]=1;
                
    //             solve(ans,prem,nums,freq);
                
    //             prem.pop_back();
    //             freq[i]=0;
    //         }
    //     }
    // }

    // void solve(vector<vector<int>>&ans,vector<int> &res,vector<int> nums,int idx)
    // {
    //     if(idx==nums.size())
    //     {
    //         // if(res.size()==nums.size())
    //         ans.push_back(res);
    //         return;
    //     }
    //     for(int i=idx;i<nums.size();i++)
    //     {
    //         res.push_back(nums[i]);
    //         swap(nums[i],nums[idx]);
    //         solve(ans,res,nums,idx+1);
    //         swap(nums[idx],nums[i]);
    //         res.pop_back();
    
    //     }
    // }

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
        // vector<vector<int>>ans;
        // vector<int>perm;
        // int freq[nums.size()];

        // for(int i=0;i<nums.size();i++)
        // freq[i]=0;
        // // sort(S.begin(),S.end());
        // solve(ans,perm,nums,freq);
        // return ans;
    }
};