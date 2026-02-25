class Solution {
    public String removeKdigits(String num, int k) 
    {
        Stack<Integer> st=new Stack<>();

        for(int i=0;i<num.length();i++)
        {
            int num_in_num=num.charAt(i)-'0';
            
            while(!st.isEmpty() && num_in_num<st.peek() && k>0)
            {
                st.pop();
                k--;
            }

            if(st.size()>0 || num_in_num!=0) //skip 1st 0's
            st.push(num_in_num);
        }
        while(!st.isEmpty() && k>0)
        {
            st.pop();
            k--;
        }
        if(st.isEmpty())
        return "0";

        String ans="";
        while(!st.isEmpty())
        {
            ans=(char)(st.pop()+'0')+ans;
        }
        return ans;

    }
}