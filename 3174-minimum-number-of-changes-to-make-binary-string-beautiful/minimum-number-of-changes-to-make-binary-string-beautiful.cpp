class Solution {
public:
    int minChanges(string s) 
    {
        char prev=s[0];
        int count=0,changes=0;
        for(int i=0;i<s.length();i++)
        {
            if(s[i]==prev)
            {
                count++;
                continue;
            }

            else
            {
                if(count%2!=0)
                {
                    count=0;
                    changes++;
                }
                else
                {
                    count=1;
                }
                prev=s[i];
            }
        }
        return changes;









        // int count=0;
        // for(int i=1;i<s.length();i+=2)
        // {
        //     if(s[i]!=s[i-1])
        //         count++;
        // }
        // return count;
    }
};