class Solution {
    public int[] frequencySort(int[] nums) 
    {
        Map<Integer,Integer> mp =new HashMap<>();
        //Integer newNums[]=new Integer[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
            // newNums[i]=nums[i];
        }
        
        return Arrays.stream(nums).boxed().sorted((x,y)->{
            if(mp.get(x)!=mp.get(y))
            return mp.get(x)-mp.get(y);
            else
            return y-x;
        }).mapToInt(x->x.intValue()).toArray();

        // System.out.println(mp);
        // return new int[]{0,0};
    }
}