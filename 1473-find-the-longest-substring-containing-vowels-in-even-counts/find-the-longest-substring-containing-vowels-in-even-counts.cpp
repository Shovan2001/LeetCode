class Solution {
public:
    int findTheLongestSubstring(string s) 
    {
        unordered_map<string,int>m;
        vector<int>freq(5,0); //a e i o u

        string currfreq="00000";
        m[currfreq]=-1;
        int res=0,ans=0;
        for(int i=0;i<s.length();i++)
        {
            if(s[i]=='a')
            {
                freq[0]^=1;
            }
            else if(s[i]=='e')
            {
                freq[1]^=1;
            }
            else if(s[i]=='i')
            {
                freq[2]^=1;
            }
            else if(s[i]=='o')
            {
                freq[3]^=1;
            }
            else if(s[i]=='u')
            {
                freq[4]^=1;
            }
            
            currfreq=to_string(freq[0])+to_string(freq[1])+to_string(freq[2])+to_string(freq[3])+to_string(freq[4]);
            
            if(m.find(currfreq)!=m.end())
            {
                res=i-m[currfreq];
                ans=max(ans,res);
            }   
            else
            m[currfreq]=i; 
        }
        return ans;
    }
};