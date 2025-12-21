class Solution {
    public int majorityElement(int[] nums) {
        
        int freq=0,maxi=-1;

        for(int i=0;i<nums.length;i++)
        {
            if(freq==0)
            {
                maxi=nums[i];
                freq=1;
            }
            else
            {
                if(maxi==nums[i])
                freq++;
                else
                freq--;
            }
        }

        int cnt=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==maxi)
            cnt++;

            if(cnt>(nums.length/2))
            return nums[i];
        }
        return maxi;
    }
}