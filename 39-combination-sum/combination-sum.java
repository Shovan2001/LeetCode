class Solution {
    void solve(List<List<Integer>> res,List<Integer> sub,int[] nums,int idx,int sum, int target)
    {
        if(sum>target || idx>=nums.length)
        return;

        if(sum==target)
        {
            res.add(new ArrayList<>(sub));
            return;
        }

        sub.add(nums[idx]);
        solve(res,sub,nums,idx,sum+nums[idx],target);
        sub.remove(sub.size()-1);
        
        solve(res,sub,nums,idx+1,sum,target);
        
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> sub=new ArrayList();

        solve(res,sub,candidates,0,0,target);

        return res;
    }
}