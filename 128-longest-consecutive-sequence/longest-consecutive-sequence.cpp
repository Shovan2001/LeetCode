class Solution {
public:
    int longestConsecutive(vector<int>& nums) {
        unordered_set<int>s;
        int length=0,max_length=0;
        for(int i=0;i<nums.size();i++)
            s.insert(nums[i]);
        //cout<<s.size();

        for(int i=0;i<nums.size();i++)
        {
            if(s.find(nums[i]-1)==s.end())
            {
                length=1;
                while(s.find(nums[i]+length)!=s.end())
                    length++;
            }
            if(length>max_length)
            max_length=length;
        }
        return max_length;
    }
};