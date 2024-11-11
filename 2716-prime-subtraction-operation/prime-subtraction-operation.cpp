class Solution {
public:
bool isPrime(int x)
    {
        for(int i=2;i<=x/2;i++)
        {
            if(x%i==0)
            return false;
        }
        return true;
    }
    bool primeSubOperation(vector<int>& nums) 
    {
        for(int i=nums.size()-2;i>=0;i--)
        {
            if(nums[i]>=nums[i+1])
            {
                for(int p=2;p<nums[i];p++)
                {
                    if(isPrime(p))
                    {
                        if(nums[i]-p<nums[i+1])
                        {
                            nums[i]-=p;
                            break;
                        }
                    }
                }
                if(nums[i]>=nums[i+1])
                return false;
            }
        }
        return true;
    }
};