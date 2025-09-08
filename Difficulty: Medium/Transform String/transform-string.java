// User function Template for Java

class Solution {
    int transform(String A, String B) {
        // code here
        if(A.length()!=B.length())
        return -1;
        
        Map<Character,Integer> mp1=new HashMap<>();
        Map<Character,Integer> mp2=new HashMap<>();
        
        for(int i=0;i<A.length();i++)
        {
            mp1.put(A.charAt(i),mp1.getOrDefault(A.charAt(i),0)+1);
        }
        
        
        for(int i=0;i<B.length();i++)
        {
            mp2.put(B.charAt(i),mp2.getOrDefault(B.charAt(i),0)+1);
        }
        
        if(!(mp1.equals(mp2)))
        return -1;
        
        int i=A.length()-1, j=B.length()-1,count=0;
        while(i>=0 && j>=0)
        {
            if(A.charAt(i)==B.charAt(j))
            {
                i--;
                j--;
            }
            else{
                count++;
                i--;
            }
        }
        return count;
    }
}