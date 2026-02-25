class Solution {
    public int minAddToMakeValid(String s) 
    {
        // Stack<Character> st=new Stack<>();
        // for(int i=0;i<s.length();i++)
        // {
        //     char ch=s.charAt(i);
        //     if(ch=='(')
        //     {
        //         st.push('(');
        //     }
        //     else
        //     {
        //         if(st.isEmpty() || st.peek()==')')
        //         st.push(')');
        //         else
        //         st.pop();
        //     }
        // }
        // return st.size();
        int open=0,close=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='(')
                open++;
            else
                if(open>0)
                open--;
                else // no one can close this bracket
                close++;
        }
        return open+close;
    }
}