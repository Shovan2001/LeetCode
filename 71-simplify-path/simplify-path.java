class Solution {
    public String simplifyPath(String path) 
    {
        Stack<String> st=new Stack<>();

        if(path.charAt(path.length()-1)!='/')
        path+='/';

        int start,end;
        for(int i=1;i<path.length();i++)
        {
            start=i;
            String str="";
            while(path.charAt(i)!='/' && i<path.length())
            {
                str+=path.charAt(i);
                i++;
            }
            end=i;
            i=end;

            // System.out.println(str);

            if(!st.isEmpty() && str.equals(".."))
                st.pop();
            if(st.isEmpty() && str.equals(".."))
                st.push("");
            if(!str.equals("") && !str.equals("..") && !str.equals("."))
                st.push(str);
            
            // System.out.println(st.peek());
        }
        
        String ans="";
        while(!st.isEmpty())
        {
            ans=st.pop()+"/"+ans;
        }

        System.out.println(ans);

        if(ans.equals(""))
        return "/";

        if(ans.charAt(0)!='/')
        ans="/"+ans;
        ans=ans.substring(0,ans.length()-1);

        if(ans.equals(""))
        return "/";

        return ans;
    }
}