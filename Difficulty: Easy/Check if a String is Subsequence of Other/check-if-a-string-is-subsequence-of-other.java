class Solution {
    public boolean isSubSeq(String s1, String s2) {
        // code here
        if(s1.length()>s2.length())
        return false;
        
        int k=0;
        for(int i=0;i<s2.length();i++)
        {
            if(s1.charAt(k)==s2.charAt(i))
            {
                k++;
            }
            if(k==s1.length())
            return true;
        }
        return false;
    }
};