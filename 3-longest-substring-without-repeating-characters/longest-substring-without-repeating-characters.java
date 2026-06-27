class Solution {
    public int lengthOfLongestSubstring(String s) 
    {
        int len,max_len=0;
        int l=0;
        Set<Character>seen=new HashSet<>();
        
        for(int r=0;r<s.length();r++)
        {
            char ch=s.charAt(r);

            while(seen.contains(ch))
            {
                seen.remove(s.charAt(l));
                l++;
            }

            seen.add(ch);
            len=r-l+1;
            max_len=Math.max(len,max_len);
        }
        return max_len;
    }
}