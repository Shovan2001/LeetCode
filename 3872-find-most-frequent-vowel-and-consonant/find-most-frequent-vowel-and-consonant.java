class Solution {
    public int maxFreqSum(String s) {
        int freq[]=new int[26];
        int maxVowels=0,maxConsonants=0;

        for(char ch: s.toCharArray())
        {
            freq[ch-'a']++;

            if("aeiou".indexOf(ch)!=-1)
            maxVowels=Math.max(maxVowels,freq[ch-'a']);
            else
            maxConsonants=Math.max(maxConsonants,freq[ch-'a']);
        }

        return maxVowels+maxConsonants;

    }
}