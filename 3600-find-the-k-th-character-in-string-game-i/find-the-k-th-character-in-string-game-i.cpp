class Solution {
public:
    char kthCharacter(int k) 
    {
        string s="a";

        while(s.size()<k)
        {
            string temp="";
            for(int i=0;i<s.size();i++)
            {
                if(s[i]!='z')
                {
                    temp+=s[i]+1;
                    // continue;
                }
                else
                temp+="a";
            }
            s+=temp;
        }
        return s[k-1];
    }
};