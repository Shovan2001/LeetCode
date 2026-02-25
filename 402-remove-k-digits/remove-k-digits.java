class Solution {
    public String removeKdigits(String num, int k) 
    {
        Stack<Integer> st=new Stack<>();

        for(int i=0;i<num.length();i++)
        {
            int num_in_num=num.charAt(i)-'0';
            // System.out.println(num_in_num);
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
            // System.out.println(st.peek());
            ans=(char)(st.pop()+'0')+ans;
        }
        return ans;
        // System.out.println(k);
        
        // System.out.println(ans);
        // int pos_1st_elem=-1;
        // for(int i=0;i<ans.length();i++)
        // {
        //     if(ans.charAt(i)!='0')
        //     {
        //         pos_1st_elem=i;
        //         break;
        //     }
        // }
        // if(pos_1st_elem==-1)
        // return "0";
        // return ans.substring(pos_1st_elem,ans.length());
    }
}