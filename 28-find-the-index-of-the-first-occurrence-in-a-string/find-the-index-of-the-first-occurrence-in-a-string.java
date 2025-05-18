class Solution {
    public int strStr(String haystack, String needle) 
    {
        int k=0;
        for(int i=0;i<haystack.length();i++)
        {
            if(haystack.charAt(i)==needle.charAt(k))
            {
                k++;
            }
            else
            {
                i=i-k;
                k=0;
            }    
            if(k==needle.length())
                return i-k+1;
        }
        return -1;
    }
}