class Solution {
public:
    bool reportSpam(vector<string>& message, vector<string>& bannedWords) 
    {
        unordered_set<string>s;

        for(int i=0;i<bannedWords.size();i++)
        {
            s.insert(bannedWords[i]);
        }
        int c=0;
        for(int i=0;i<message.size();i++)
        {
            if(s.find(message[i])!=s.end())
            c++;
            if(c==2)
            return true;
        }
        return false;
    }
};