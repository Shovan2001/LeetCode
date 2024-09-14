class Solution {
public:
    void sortColors(vector<int>& nums) 
    {
        int i=0,l=0,h=nums.size()-1;

        while(i<=h)
        {
            if(nums[i]==0)
            {
                swap(nums[i],nums[l]);
                i++;
                l++;
            }
            else if(nums[i]==1)
            {
                i++;
            }
            // else if(nums[i]>1)
            else
            {
                swap(nums[i],nums[h]);
                h--;
            //    i++;
            }
        }
    }
};