class Solution {
public:
    int mySqrt(int x) 
    {
        if(x==0 || x==1)
        return x;
        long l=0,h=x/2,mid;
        long ans;
        while(l<=h)
        {
            mid=l+(h-l)/2;
            if(mid*mid==x)
            {
                return mid;
            }
            else if(mid*mid>x)
            {
                //ans=mid;
                h=mid-1;
            }
            else
            {
                ans=mid;
                l=mid+1;
            }
        }
        return ans;
    }
};