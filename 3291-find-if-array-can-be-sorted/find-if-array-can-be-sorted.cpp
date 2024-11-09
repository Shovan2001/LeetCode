class Solution {
public:int countSetBits(int n)
    {
        int c=0;
        while(n>0)
        {
            n&=n-1;
            c++;
        }
        return c;
    }
    bool canSortArray(vector<int>& nums) 
    {
        for(int i=0;i<nums.size()-1;i++)
        {
            if(nums[i]>nums[i+1])
            {
                if(countSetBits(nums[i])==countSetBits(nums[i+1]))
                {
                    swap(nums[i],nums[i+1]);
                    i=-1;
                }
                else
                return false;        
            }
        }
        return true;
    }
};