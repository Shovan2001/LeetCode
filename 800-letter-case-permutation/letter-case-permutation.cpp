class Solution {
public:
    void solve(vector<string> &ans,string s,string op,int idx)
    {
        if(idx==s.length())
        {   
            ans.push_back(op);
            return;
        }

        if(!isdigit(s[idx]))
        {
            op+=(char)toupper(s[idx]);
            solve(ans,s,op,idx+1);
            op.pop_back();
            op+=(char)tolower(s[idx]);
            solve(ans,s,op,idx+1);
        }
        else
        {
            op+=s[idx];
            solve(ans,s,op,idx+1);
        }
    }
    vector<string> letterCasePermutation(string s) 
    {
        vector<string>ans;
        solve(ans,s,"",0);
        return ans;
    }
};