class Solution {
public:
    void solve(vector<string> &ans,int open,int close,string op)
    {
        if(open==0 && close==0)
        {
            ans.push_back(op);
            return;
        }

        if(open!=0)
        {
            string op1=op;
            op1+='(';
            solve(ans,open-1,close,op1);
        }
        if(close>open)
        {
            string op2=op;
            op2+=')';
            solve(ans,open,close-1,op2);
        }
    }
    vector<string> generateParenthesis(int n) 
    {
        vector<string>ans;
        int open=n,close=n;
        string op="";
        solve(ans,open,close,op);
        return ans;
    }
};