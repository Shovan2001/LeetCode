class Solution {
public:
    bool uniqueOccurrences(vector<int>& arr) 
    {
        unordered_map<int,int>m;
        unordered_set<int>s;
        
        for(int i=0;i<arr.size();i++)
        m[arr[i]]++;

        for(auto it: m)
        {
            if(s.find(it.second)!=s.end())
            return false;
            s.insert(it.second);
        }
        return true;
    }
};