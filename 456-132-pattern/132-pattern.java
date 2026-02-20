class Solution {
    // public void generateSubset(List<List<Integer>> allSubsets,List<Integer> subset,int nums[],int idx)
    // {
    //     if(subset.size()==3)
    //     {
    //         allSubsets.add(new ArrayList<>(subset));
    //         return;
    //     }
    //     if(idx==nums.length)
    //     return;
        
    //     subset.add(nums[idx]);
    //     generateSubset(allSubsets,subset,nums,idx+1);
    //     subset.remove(subset.size()-1);

    //     generateSubset(allSubsets,subset,nums,idx+1);
    // }
    // public boolean find132pattern(int[] nums) 
    // {
    //     List<List<Integer>> allSubsets=new ArrayList<>();
    //     List<Integer> subset=new ArrayList<>();

    //     generateSubset(allSubsets,subset,nums,0);

    //     for(int i=0;i<allSubsets.size();i++)
    //     {
            
    //             if(allSubsets.get(i).get(0)<allSubsets.get(i).get(2) 
    //                 && allSubsets.get(i).get(2)<allSubsets.get(i).get(1))
    //             return true;
    //         // }
    //         // System.out.println();
    //     }
    //     return false;
    // }
    public boolean find132pattern(int[] nums) 
    {
        Stack<Integer> st=new Stack<>();
        
        int nums3=Integer.MIN_VALUE; //2nd elem
        for(int i=nums.length-1;i>=0;i--)
        {
            if(nums[i]<nums3)
            return true;

            while(!st.isEmpty() && nums[i]>st.peek())
            {
                nums3=st.pop();
            }

            st.push(nums[i]);
        }
        return false;
    }
}