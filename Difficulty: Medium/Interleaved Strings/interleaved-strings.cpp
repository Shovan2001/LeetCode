class Solution {
  public:
    bool checkSameElements(string& s1, string& s2, string& s3)
    {
        unordered_map<char,int>mp;
        
        for(int i=0;i<s1.length();i++)
        {
            mp[s1[i]]++;
        }
        for(int i=0;i<s2.length();i++)
        {
            mp[s2[i]]++;
        }
        for(int i=0;i<s3.length();i++)
        {
            mp[s3[i]]--;
        }
        
        for(auto it:mp)
        {
            if(it.second!=0)
            return false;
        }
        return true;
    }
    
    bool checkSubsequence1(string& s1, string& s3)
    {
        int k=0;
        for(int i=0;i<s3.length();i++)
        {
            if(s3[i]==s1[k])
            k++;
            
            if(k==s1.length())
            return true;
        }
        return false;
    }
    bool checkSubsequence2(string& s2, string& s3)
    {
        int k=0;
        for(int i=0;i<s3.length();i++)
        {
            if(s3[i]==s2[k])
            k++;
            
            if(k==s2.length())
            return true;
        }
        return false;
    }
    bool isInterleave(string& s1, string& s2, string& s3) {
        // code here
        if(s1.length()+s2.length()!=s3.length())
        return false;
        
        if(checkSameElements(s1,s2,s3) && checkSubsequence1(s1,s3) && checkSubsequence1(s2,s3))
        return true;
        
        return false;
        
    }
};