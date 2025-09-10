class Solution {
public:
    int jump(vector<int>& nums) {
        
        if(nums.size()==1)
        return 0;

        if(nums[0]==0)
        return -1;

        int maxICanReach=nums[0];
        int currentReachablePoint=nums[0];
        int jumps=1;

        for(int i=1;i<nums.size();i++)
        {
            if(i>=nums.size()-1)
            return jumps;

            maxICanReach=max(maxICanReach,i+nums[i]);
            
            if(i==currentReachablePoint)
            {
                jumps++;
                currentReachablePoint=maxICanReach;
            }

            if(i>=maxICanReach)
            return -1;
        }
        return -1;

    }
};