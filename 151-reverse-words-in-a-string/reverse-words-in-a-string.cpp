class Solution {
public:
    string reverseWords(string s) 
    {
        int st=0,end=s.length()-1;
        //remove leading spaces
        while(s[st]==' ')
        st++;
        //remove trailing spaces
        while(s[end]==' ')
        end--;
        string str="";
        
        for(int i=st;i<=end;i++)
        {
            if(s[i]!=' ')
            str+=s[i];
            //add spaces in between words // We know it was a word when s[i-1]!=' ' (prev letter is not a space)
            if(s[i]==' ' && s[i-1]!=' ')
            str+=s[i];
            // // //remove leading spaces
            // // if(s[i]==' ' && str.length()==0)
            // // continue;
            // //enter a space in between words as s[i-1]!=' '
            // if(s[i]==' ' && str.length()!=0 && s[i-1]!=' ')
            // str+=s[i];
            // //igores all rest spaces
            // if(s[i]!=' ')
            // str+=s[i];
        }
        str+=' ';
        // cout<<str;
        
        string word="",rev="";
        for(int i=0;i<str.length();i++)
        {
            if(str[i]!=' ')
            word+=str[i];
            else
            {
                word+=' ';
                rev=word+rev;
                word="";
            }
        }
        return rev.substr(0,rev.length()-1);
        // for(int i=0;i<str.length();i++)
        // {
        //     if(str[i]!=' ')
        //     word+=s[i];
        //     else

        // }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        // string res="",rev="";
        // for(int i=0;i<str.length();i++)
        // {
        //     if(str[i]!=' ')
        //     res+=str[i];
        //     if(str[i]==' ' && str[i-1]!=' ')
        //     res+=" ";
        //     if(str[i]==' ')
        //     {
        //         rev=res+rev;
        //         res="";
        //     }
            
        // }
        // return rev.substr(0,rev.length()-1);
        // return s;
    }
};