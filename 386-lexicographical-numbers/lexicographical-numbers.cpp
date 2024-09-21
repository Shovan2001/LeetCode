class Solution {
public:
    void solve(vector<int> &ans,int curr_num,int n)
    {
        if(curr_num>n)
        return;
        else
        ans.push_back(curr_num);

        for(int j=0;j<=9;j++)
        {
            solve(ans,(curr_num*10)+j,n);
        }

    }
    vector<int> lexicalOrder(int n) 
    {
        vector<int> ans;
        for(int i=1;i<=9;i++)
        {
            solve(ans,i,n);
        }
        return ans;
    }
};