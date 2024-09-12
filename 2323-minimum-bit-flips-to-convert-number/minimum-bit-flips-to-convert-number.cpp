class Solution {
public:
    int minBitFlips(int start, int goal) 
    {
        int num=start^goal;
        cout<<num;
        int c=0;
        while(num!=0)
        {
            num=num&num-1;
            c++;
        }
        return c;
    }
};