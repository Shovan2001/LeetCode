class Solution {
    public int[] twoRepeated(int[] arr) {
        // code here
        int ans[]=new int[2];
        
        Set<Integer>s=new HashSet<>();
        
        int x=0;
        for(int i=0;i<arr.length;i++)
        {
            if(s.contains(arr[i]))
            {
                ans[x++]=arr[i];
                if(x==2)
                break;
            }
            else
            s.add(arr[i]);
        }
        return ans;
    }
}