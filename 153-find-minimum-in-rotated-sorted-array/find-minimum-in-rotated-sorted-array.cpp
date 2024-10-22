class Solution {
public:
    int findMin(vector<int>& nums) 
    {
        int l=0,h=nums.size()-1,n=nums.size();
        // if(n==1)
        // return nums[0];
        while(l<h)
        {
            int mid=l+(h-l)/2;
            // int prev=(mid+n-1)%n;
            // int next=(mid+1)%n;
            
            // if(nums[mid]<=nums[prev] && nums[mid]<=nums[next])
            // return nums[mid];
            
            //move to unsorted part
            if(nums[mid]<nums[h])
            h=mid;
            else //if(nums[mid]<nums[h])
            l=mid+1;
        }
        return nums[l];
    }
};