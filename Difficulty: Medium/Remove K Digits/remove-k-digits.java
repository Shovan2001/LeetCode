class Solution {
    public String removeKdig(String s, int k) {
        // code here
        if(k>=s.length())
        return "0";
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            while(!st.isEmpty() && ch<st.peek() && k>0)
            {
                st.pop();
                k--;
            }
            if(st.size()>0 || ch!='0')
            st.push(ch);
        }
        
        while(!st.isEmpty() && k>0)
        {
            st.pop();
            k--;
        }
        if(st.isEmpty())
        return "0";
        
        StringBuilder str=new StringBuilder();
        while(!st.isEmpty())
        {
            str.append(st.pop());
        }
        
        return str.reverse().toString();
        
    }
}