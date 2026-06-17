class Solution {
    public int longestUniqueSubstr(String s) {
        // code here
        Set<Character> seen=new HashSet<>();
        
        int l=0,max_len=Integer.MIN_VALUE;
        for(int r=0;r<s.length();r++)
        {
            while(seen.contains(s.charAt(r)))
            {
                seen.remove(s.charAt(l));
                l++;
            }
            seen.add(s.charAt(r));
            max_len=Math.max(max_len,r-l+1);
        }
        
        return max_len;
    }
}