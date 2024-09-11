class Solution {
public:
    vector<int> productExceptSelf(vector<int>& nums) 
    {
        int n=nums.size();
        vector<int>res(n);
        res[0]=1;
        
        for(int i=1;i<nums.size();i++)
        res[i]=res[i-1]*nums[i-1];

        int rp=1;
        for(int i=n-1;i>=0;i--)
        {
            res[i]=rp*res[i];
            rp*=nums[i];
        }

        return res;
        
    }
};