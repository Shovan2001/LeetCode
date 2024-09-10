class Solution {
public:
    bool wordPattern(string pattern, string s) 
    {
        string word="";
        s=s+' ';
        int x=0;
        unordered_map<char,string>m;
        unordered_set<string>res;
        for(int i=0;i<s.length();i++)
        {
            if(s[i]!=' ')
            word+=s[i];
            else
            {
                if(m.find(pattern[x])!=m.end())
                {
                    if(m[pattern[x]]!=word)
                    return false;
                } 
                else
                {
                    if(res.find(word)!=res.end())
                    return false;
                    res.insert(word);
                    m[pattern[x]]=word;
                }
                word="";
                x++;
            }
        }
        if(pattern.length()==x)
        return true;
        else
        return false;
    }
};