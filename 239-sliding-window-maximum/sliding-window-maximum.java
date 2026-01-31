class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) 
    {
        Deque<Integer> dq=new ArrayDeque<>();
        int ans[]=new int[nums.length-k+1];

        int x=0;
        for(int i=0;i<nums.length;i++)
        {
            while(!dq.isEmpty() && i-dq.getFirst()>=k)
                dq.removeFirst();
            while(!dq.isEmpty() && nums[i]>=nums[dq.getLast()])
                dq.removeLast();
            dq.addLast(i);
            
            if(i>=k-1)
                ans[x++]=nums[dq.getFirst()];            
        }

        return ans;
    }
}