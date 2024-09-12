class Solution {
public:

    void solve(vector<vector<int>>&ans,vector<int>&sub,int s,int n,int k)
    {
        if(s==n+1)
        {
            if(sub.size()==k)
            ans.push_back(sub);
            return;
        }
        sub.push_back(s);
        solve(ans,sub,s+1,n,k);
        sub.pop_back();
        solve(ans,sub,s+1,n,k);

    }
    vector<vector<int>> combine(int n, int k) 
    {
        vector<vector<int>>ans;
        vector<int>sub;
        solve(ans,sub,1,n,k);
        return ans;
    }
};