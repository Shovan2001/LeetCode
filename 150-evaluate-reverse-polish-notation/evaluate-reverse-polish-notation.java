class Solution {
    public int evalRPN(String[] tokens) 
    {
        Stack<String>st=new Stack<>();

        for(int i=0;i<tokens.length;i++)
        {
            String str=tokens[i];
            if (!str.equals("+") && !str.equals("-") && !str.equals("*") && !str.equals("/"))
                st.push(str);
            else
            {
                int second=Integer.parseInt(st.pop());
                int first=Integer.parseInt(st.pop());

                int ans=0;
                if(str.equals("+"))
                {
                    ans=first+second;
                }
                else if(str.equals("-"))
                {
                    ans=first-second;
                }
                else if(str.equals("*"))
                {
                    ans=first*second;
                }
                else if(str.equals("/"))
                {
                    ans=first/second;
                }
                st.push(String.valueOf(ans));
            }
        }
        return Integer.parseInt(st.peek());
    }
}