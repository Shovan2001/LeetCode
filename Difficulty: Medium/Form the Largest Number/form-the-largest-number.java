class Solution {
    public String findLargest(int[] arr) {
        // code here
        String[] nums = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            nums[i] = String.valueOf(arr[i]);
        }
        Arrays.sort(nums,(a,b)->(b+a).compareTo(a+b));
                      
        if (nums[0].equals("0")) return "0";  
        
        StringBuilder ans = new StringBuilder();
        
        for(int i=0;i<nums.length;i++)
        {
            ans.append(nums[i]);
        }
        return ans.toString();
    }
}