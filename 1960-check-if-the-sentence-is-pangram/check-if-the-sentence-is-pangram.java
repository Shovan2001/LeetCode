class Solution {
    public boolean checkIfPangram(String sentence) 
    {
        // sentence=sentence.toLowerCase();

        int []alpha=new int[26];

        for(int i=0;i<sentence.length();i++)
        {
            alpha[sentence.charAt(i)-97]++;
        }
        
        for(int i=0;i<26;i++)
        {
            if(alpha[i]==0)
            return false;
        }
        return true;
    }
}