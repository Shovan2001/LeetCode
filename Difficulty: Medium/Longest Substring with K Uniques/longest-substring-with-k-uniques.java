class Solution {
    public int longestKSubstr(String s, int k) {
        // code here
        int j=0,ans=0;
        Map<Character,Integer> mp=new HashMap<>();
        
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            
            mp.put(ch,mp.getOrDefault(ch,0)+1);
            
            while(mp.size()>k)
            {
                mp.put(s.charAt(j),mp.get(s.charAt(j))-1);
                
                if(mp.get(s.charAt(j))==0)
                mp.remove(s.charAt(j));
                
                j++;
            }
            ans=Math.max(ans,i-j+1);
        }
        if(mp.size()!=k)
        return -1;
        else
        return ans;
    }
}