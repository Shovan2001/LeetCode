class Solution {
public:
    void sortColors(vector<int>& nums) 
    {
        int i=0,l=0,h=nums.size()-1;
        //l's left has all 0s
        //h's right has all 2s
        //l denotes the place everything to its left is sorted
        // h denotes the place everything to its right is sorted
        while(i<=h)
        {
            if(nums[i]==0)
            {
                swap(nums[l],nums[i]);
                l++;
                i++;
            }
            else if(nums[i]==2)
            {
                swap(nums[h],nums[i]);
                h--;
            }
            else
            {
                i++;
            }
        }
        cout<<l<<i<<h;
    }
};