class Solution {
    public int prefixCount(String[] words, String pref) 
    {
        int c=0;
        for(int i=0;i<words.length;i++)
        {
            String curr_word=words[i];
            int k=0;
            for(int j=0;j<curr_word.length();j++)
            {
                if(curr_word.charAt(j)==pref.charAt(k))
                {
                    k++;
                }
                else
                    break;
                if(k==pref.length())    
                {
                    c++;
                    break;
                }
            }
        }
        return c;
    }
}