class Solution {
public:
    bool isIsomorphic(string s, string t) 
    {
        if(s.length()!=t.length())
        return false;

        unordered_map<char,char>m;
        unordered_set<char>res;
        for(int i=0;i<s.length();i++)
        {
            if(m.find(s[i])!=m.end())
            {
                if(m[s[i]]!=t[i])
                return false;
            }
            else
            {
                if(res.find(t[i])!=res.end())
                return false;
                res.insert(t[i]);
                m[s[i]]=t[i];
            }
        }
        return true;
    }
};