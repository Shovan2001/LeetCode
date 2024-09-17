class Solution {
public:
    vector<string> uncommonFromSentences(string s1, string s2) 
    {
        unordered_map<string,int>m1;
        unordered_map<string,int>m2;
    
        s1+=' ';
        s2+=' ';
        string word1="";
        for(int i=0;i<s1.length();i++)
        {
            if(s1[i]==' ')
            {
                m1[word1]++;
                word1="";
            }
            else
                word1+=s1[i];
        }
        //cout<<word1;
        string word2="";
        for(int i=0;i<s2.length();i++)
        {
            if(s2[i]==' ')
            {
                m2[word2]++;
                word2="";
            }
            else
                word2+=s2[i];
        }
        
        vector<string>ans;

        for(auto it: m1)
        {
            if(it.second==1)
            {
                if(m2.find(it.first)==m2.end())
                ans.push_back(it.first);
            }
        }

        for(auto it: m2)
        {
            if(it.second==1)
            {
                if(m1.find(it.first)==m1.end())
                ans.push_back(it.first);
            }
        }
        return ans;
    }
};