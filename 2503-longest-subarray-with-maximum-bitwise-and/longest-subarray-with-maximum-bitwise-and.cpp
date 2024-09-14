class Solution {
public:
    int longestSubarray(vector<int>& nums) 
    {
        int maxi=nums[0];
        for(int i=1;i<nums.size();i++)
        {
            maxi=max(maxi,nums[i]);
        }

        int c=0,x=0;
        for(int i=0;i<nums.size();i++)
        {
            if(nums[i]==maxi)
            {
                c++;
                x=max(x,c);
                
            }
            else
            {
                c=0;
            }
        }
        return x;
    }
};