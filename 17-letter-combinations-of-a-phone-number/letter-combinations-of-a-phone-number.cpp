class Solution {
public:

    void solve(vector<string> &ans,string digits,string op,unordered_map<char,string>mp,int idx)
    {
        if(idx==digits.length())
        {
            ans.push_back(op);
            return;
        }

        char temp=digits[idx];
        string res=mp[temp];

        for(int i=0;i<res.length();i++)
        {
            op.push_back(res[i]);
            solve(ans,digits,op,mp,idx+1);
            op.pop_back();
        }

    }
    vector<string> letterCombinations(string digits) 
    {
        if(digits.length()==0)
        return {};
        unordered_map<char,string>mp;
        vector<string>ans;
        mp['2']="abc";
        mp['3']="def";
        mp['4']="ghi";
        mp['5']="jkl";
        mp['6']="mno";
        mp['7']="pqrs";
        mp['8']="tuv";
        mp['9']="wxyz";
        solve(ans,digits,"",mp,0);

        return ans;
    }
};