class Solution {
public:
    int minChanges(string s) 
    {
        int count=0,one=0,zero=0;
        for(int i=1;i<s.length();i=i+2)
        {
            // if(s[i-1]=='1')
            //     one++;
            // else if(s[i-1]=='0')
            //     zero++;

            if(s[i]!=s[i-1])
            {
                count++;
                // one=0;
                // zero=0;
            }
        }
        return count;
    }
};