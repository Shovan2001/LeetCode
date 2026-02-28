class Solution {

    // Function to return length of longest subsequence of consecutive integers.
    public int longestConsecutive(int[] arr) {
        // code here
        int max_len=1;
        Set<Integer> s=new HashSet<>();
        
        for(int i=0;i<arr.length;i++)
        s.add(arr[i]);
        
        for(int i=0;i<arr.length;i++)
        {
            if(!s.contains(arr[i]-1))
            {
                int length=1;
                while(s.contains(arr[i]+length))
                {
                    length++;
                    max_len=Math.max(max_len,length);
                }
            }
        }
        return max_len;
    }
}