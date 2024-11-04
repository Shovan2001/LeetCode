class Solution {
public:
    bool wordPattern(string pattern, string s) 
    {
        unordered_map<char,string>m;
        unordered_set<string>res;
        s+=' ';
        string word="";
        int x=0;
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
                x++;
                word="";
            }
        }
        if(x==pattern.length())
        return true;
        return false;






















        // string word="";
        // s=s+' ';
        // int x=0;
        // unordered_map<char,string>m;
        // unordered_set<string>res;
        // for(int i=0;i<s.length();i++)
        // {
        //     if(s[i]!=' ')
        //     word+=s[i];
        //     else
        //     {
        //         // Got a word
        //         // Pattern[X] present in the map ???
        //         if(m.find(pattern[x])!=m.end())
        //         {
        //             // Present in the map
        //             // m[pattern[x]] has a different value than the word which is incoming
        //             if(m[pattern[x]]!=word)
        //             return false;
        //         } 

        //         // Pattern[X] not present in the map
        //         else
        //         {
        //             // is the incoming word linked to any other pattern ?? If yes then we return false
        //             if(res.find(word)!=res.end())
        //             return false;
        //             //new pattern and new word incoming
        //             //insert into the set and map
        //             res.insert(word);
        //             m[pattern[x]]=word;
        //         }
        //         //empty the word and increase x for new incoming data
        //         word="";
        //         x++;
        //     }
        // }
        // //x and pattern's length matches
        // if(pattern.length()==x)
        // return true;
        // else
        // return false;
    }
};