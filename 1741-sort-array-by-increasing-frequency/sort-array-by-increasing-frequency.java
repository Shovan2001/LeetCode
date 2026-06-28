class Solution {
    public int[] frequencySort(int[] nums) 
    {
        Map<Integer,Integer> mp =new HashMap<>();
        
        for(int i=0;i<nums.length;i++)
        {
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }
        
        return Arrays.stream(nums).boxed().sorted((x,y)->{
            if(mp.get(x)!=mp.get(y))
            return mp.get(x)-mp.get(y);
            else
            return y-x;
        })//.mapToInt(x->x.intValue()).toArray();
        .mapToInt(Integer::intValue).toArray();
        // System.out.println(mp);
        // return new int[]{0,0};
    }
}