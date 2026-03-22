// User function Template for Java

class Solution {
    public int findMinDiff(ArrayList<Integer> arr, int m) {
        // your code here
        Collections.sort(arr);
        
        int l=0,h=m-1;
        int min_diff=Integer.MAX_VALUE;
        
        while(h<arr.size())
        {
            int diff=arr.get(h)-arr.get(l);
            
            if(diff<min_diff)
            min_diff=diff;
            
            l++;
            h++;
        }
        return min_diff;
    }
}