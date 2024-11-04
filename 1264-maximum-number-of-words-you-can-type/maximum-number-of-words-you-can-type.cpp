class Solution {
public:
    int canBeTypedWords(string text, string brokenLetters) 
    {
        string word="";
        int x=0;
        text+=' ';
        for(int i=0;i<text.length();i++)
        {
            if(text[i]!=' ')
            word+=text[i];
            else
            {
                int c=0;
                for(int j=0;j<brokenLetters.length();j++)
                {
                    if(word.find(brokenLetters[j])!=string::npos)
                    {
                        c=1;
                        break;
                    }
                }
                if(c==0)
                x++;
                word="";
            }
        }
        return x;
    }
};