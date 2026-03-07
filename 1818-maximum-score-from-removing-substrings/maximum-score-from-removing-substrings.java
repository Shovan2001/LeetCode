class Solution {
    public int maximumGain(String s, int x, int y) 
    {
        String maxString,minString;
        int maxPoints,minPoints;

        if(x>y)
        {
            maxString="ab";
            minString="ba";
            maxPoints=x;
            minPoints=y;
        }
        else
        {
            maxString="ba";
            minString="ab";
            maxPoints=y;
            minPoints=x;
        }
        
        int points=0;
        Stack<Character>st=new Stack<>();

        //maxString
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);

            if(ch==maxString.charAt(1) && !st.isEmpty() && st.peek()==maxString.charAt(0))
            {
                st.pop();
                points+=maxPoints;
            }
            else
            st.push(ch);
        }

        String str="";
        while(!st.isEmpty())
        {
            str=st.pop()+str;
        }
        
        //minString
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);

            if(ch==minString.charAt(1) && !st.isEmpty() && st.peek()==minString.charAt(0))
            {
                st.pop();
                points+=minPoints;
            }
            else
            st.push(ch);
        }

        return points;
    }
}