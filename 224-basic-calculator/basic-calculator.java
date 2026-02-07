class Solution {
    public int calculate(String s) 
    {
        Stack<Integer> st=new Stack<>();
        int ans=0,num=0,sign=1;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);

            if(ch>='0' && ch<='9')
            num=num*10+(ch-'0');
            else if(ch=='+' || ch=='-')
            {
                ans+=sign*num;
                num=0;
                if(ch=='+')
                sign=1;
                else // if(ch=='-')
                sign=-1;
            }
            else if(ch=='(')
            {
                st.push(ans);
                st.push(sign);
                ans=0;
                sign=1;
            }
            else if(ch==')') //---> ')'
            {
                ans+=sign*num;
                num=0;

                int x=st.pop();
                int y=st.pop();

                ans*=x;
                ans+=y;
            }
        }
        if(num!=0)
        ans+=sign*num;

        return ans;
    }
}