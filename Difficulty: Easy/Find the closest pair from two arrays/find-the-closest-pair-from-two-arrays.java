class Solution {
    public static ArrayList<Integer> findClosestPair(int arr1[], int arr2[], int x) {
        // code here
        ArrayList<Integer> ans=new ArrayList<>();
        int l=0,h=arr2.length-1,min_diff=Integer.MAX_VALUE;
        
        while(l<arr1.length && h>=0)
        {
            int curr_sum=arr1[l]+arr2[h];
            
            int diff=Math.abs(curr_sum-x);
            if(diff<min_diff)
            {
                min_diff=diff;
                // System.out.println(arr1[l]+" "+arr2[h]);
                ans.add(0,arr1[l]);
                ans.add(1,arr2[h]);
            }
            
            if(curr_sum>x)
            h--;
            else
            l++;
            
        }
        return ans;
    }
}