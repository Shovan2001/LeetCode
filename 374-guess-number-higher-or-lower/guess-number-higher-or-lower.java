/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) 
    {
        int l=1,h=n;

        while(l<=h)
        {
            int guess_no=l+(h-l)/2;

            int val=guess(guess_no);

            if(val==0)
            return guess_no;
            else if(val==1)
            l=guess_no+1;
            else
            h=guess_no-1;
        }
        return 0;
    }
}