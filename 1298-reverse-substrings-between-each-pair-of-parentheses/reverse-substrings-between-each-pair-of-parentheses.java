class Solution {
    public String reverseParentheses(String s) 
    {
        Stack<Integer> st=new Stack<>();
        StringBuilder res=new StringBuilder();
        
        // if(s.charAt(0)!='(' && s.charAt(s.length()-1)!=')')
        // {
        //     s='('+s+')';
        //     rev=1;
        // }
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(')
                st.push(res.length());
            else if(s.charAt(i)==')')
            { 
                int start_idx=st.pop();
                String substr_reversed=new StringBuilder(res.substring(start_idx,res.length())).reverse().toString();
                res.replace(start_idx,res.length(),substr_reversed);
            }
            else
                res.append(s.charAt(i));
        }
        return res.toString();
    }
}