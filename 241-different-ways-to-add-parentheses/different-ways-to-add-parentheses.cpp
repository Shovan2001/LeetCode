class Solution {
public:
    vector<int> diffWaysToCompute(string expression) 
    {
        vector<int>ans;

        for(int i=0;i<expression.length();i++)
        {
            if(expression[i]=='+' || expression[i]=='-' || expression[i]=='*')
            {
                vector<int>left_part=diffWaysToCompute(expression.substr(0,i));
                vector<int>right_part=diffWaysToCompute(expression.substr(i+1,expression.length()));

                for(int x: left_part)
                {
                    for(int y: right_part)
                    {
                        if(expression[i]=='+')
                        {
                            ans.push_back(x+y);
                        }
                        else if(expression[i]=='-')
                        {
                            ans.push_back(x-y);
                        }
                        else
                        {
                            ans.push_back(x*y);
                        }
                    }
                }  

            }
        }
        if(ans.empty())
        {
            ans.push_back(stoi(expression));
        }
        return ans;
    }
};