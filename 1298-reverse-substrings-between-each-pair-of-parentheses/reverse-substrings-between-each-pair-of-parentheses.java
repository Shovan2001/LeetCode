class Solution {
    public String reverseParentheses(String s) 
    {
        Stack<Integer> st=new Stack<>();
        StringBuilder res=new StringBuilder();
        
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);

            if(ch=='(')
            {
                st.push(res.length());
            }
            else if(ch==')')
            {
                int start_idx=st.pop();
                String sub_str=res.substring(start_idx,res.length());//returns string not stringbuilder
                String sub_str_reversed=new StringBuilder(sub_str).reverse().toString();
                // String sub_str_reversed=res.substring(start_idx,res.length()).reverse().toString();
                res.replace(start_idx,res.length(),sub_str_reversed);
            }
            else
            {
                res.append(ch);
            }
        }

        return res.toString();

























        // // if(s.charAt(0)!='(' && s.charAt(s.length()-1)!=')')
        // // {
        // //     s='('+s+')';
        // //     rev=1;
        // // }
        // for(int i=0;i<s.length();i++)
        // {
        //     if(s.charAt(i)=='(')
        //         st.push(res.length());
        //     else if(s.charAt(i)==')')
        //     { 
        //         int start_idx=st.pop();
        //         String substr_reversed=new StringBuilder(res.substring(start_idx,res.length())).reverse().toString();
        //         res.replace(start_idx,res.length(),substr_reversed);
        //     }
        //     else
        //         res.append(s.charAt(i));
        // }
        // return res.toString();
    }
}