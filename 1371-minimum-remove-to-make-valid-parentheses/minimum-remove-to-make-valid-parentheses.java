class Solution {
    public String minRemoveToMakeValid(String s) 
    {
        Stack<Integer> st=new Stack<>();
        Set<Integer> set=new HashSet<>();

        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);

            // if(ch>='a' && ch<='z')
            // st.push(ch);//ans+=ch;

            if(ch=='(')
            {
                st.push(i);
                set.add(i);
            }
            else if(ch==')')
            {
                if(st.isEmpty() || s.charAt(st.peek())==')')
                {
                    st.push(i);
                    set.add(i);
                }
                else
                {
                    set.remove(st.peek());
                    st.pop();
                }
            }
        }

        String ans="";
        for(int i=0;i<s.length();i++)
        {
            if(!set.contains(i))
            ans+=s.charAt(i);
            else
            continue;

        }
        // for(int elem:set)
        // System.out.println(elem);
        
        return ans;
    }
}