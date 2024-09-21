class Solution {
public:
    void solve(set<vector<int>>&ans,vector<int>&res,vector<int> nums,int idx)
    {
        if(idx==nums.size())
        {
            ans.insert(res);
            return;
        }

        for(int i=idx;i<nums.size();i++)
        {
            res.push_back(nums[i]);
            swap(nums[i],nums[idx]);
            solve(ans,res,nums,idx+1);
            swap(nums[idx],nums[i]);
            res.pop_back();
        }
    }
    // void solve(set<vector<int>>&ans,vector<int>&prem,vector<int> nums,int freq[])
    // {
    //     if(prem.size()==nums.size())
    //     {
    //         ans.insert(prem);
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
    vector<vector<int>> permuteUnique(vector<int>& nums) {
        
        set<vector<int>>ans;
        vector<int>res;

        solve(ans,res,nums,0);
        vector<vector<int>>answer(ans.begin(),ans.end());
        return answer;
        // set<vector<int>>ans;
        // vector<int>perm;
        // int freq[nums.size()];

        // for(int i=0;i<nums.size();i++)
        // freq[i]=0;
        // // sort(S.begin(),S.end());
        // solve(ans,perm,nums,freq);

        // vector<vector<int>>res(ans.begin(),ans.end());
        
        // return res;
    }
};