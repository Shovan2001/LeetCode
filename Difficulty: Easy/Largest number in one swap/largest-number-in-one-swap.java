class Solution {
    public String swap(int pos1,int pos2,String s)
    {
        StringBuilder str=new StringBuilder(s);
        
        char temp=str.charAt(pos1);
        str.setCharAt(pos1, str.charAt(pos2));
        str.setCharAt(pos2, temp);
        // str.charAt(0)=str.charAt(y);
        // str.charAt(y)=temp;
        
        return str.toString();
    }
    public String largestSwap(String s) {
        // code here
        int maxi=Integer.MIN_VALUE;//,mini=Integer.MAX_VALUE;
        int maxipos=0,pos1=-1,pos2=-1;//,minipos;
        
        for(int i=s.length()-1;i>=0;i--)
        {
            if(s.charAt(i)-'0'>maxi)
            {
                maxi=s.charAt(i)-'0';
                maxipos=i;
            }
            
            if(s.charAt(i)-'0'<maxi)
            {
                pos1=i;
                pos2=maxipos;
            }
        }
        
        if(pos1==-1)
        return s;
        
        String ans=swap(pos1,pos2,s);
        
        return ans;
    }
}