class Solution {
public:
    bool canJump(vector<int>& nums) 
    {
        if(nums.size()==1)
        return true;
        if(nums[0]==0)
        return false;
        
        int fathestReachablePoint=nums[0];
        int currentReachablePoint=nums[0];

        for(int i=1;i<nums.size();i++)
        {
            if(i==nums.size()-1)
            return true;

            fathestReachablePoint=max(fathestReachablePoint,i+nums[i]);

            // if(i==currentReachablePoint)
            // {
            //     currentReachablePoint=fathestReachablePoint;
            // }

            if(i>=fathestReachablePoint)
            return false;
        }
        return false;
    }
};