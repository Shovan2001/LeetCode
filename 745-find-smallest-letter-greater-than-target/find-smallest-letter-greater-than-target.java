class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int l=0,h=letters.length;
        
        while(l<h)
        {
            int mid=l+(h-l)/2;

            if(letters[mid]<target+1)
            l=mid+1;
            else
            h=mid;
        }
        System.out.println(l);
        if(l<letters.length-1 && letters[l]==target)
        {
            if(letters[letters.length-1]==target)
            return letters[0];
            else
            return letters[l+1];
        }    
        else if(l<=letters.length-1 && letters[l]!=target)
            return letters[l];
        else
            return letters[0];
    }
}