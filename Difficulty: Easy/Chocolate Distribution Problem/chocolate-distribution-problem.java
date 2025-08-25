// User function Template for Java

class Solution {
    public int findMinDiff(ArrayList<Integer> arr, int m) {
        // your code here
        Collections.sort(arr);
        
        int mini=Integer.MAX_VALUE;
        int s=0,e=s+m-1;    // Window
                            // shifts by 1 place 
        
        while(e<arr.size())
        {
            int diff=arr.get(e)-arr.get(s);
            
            if(diff<mini)
            mini=diff;
            
            s++;
            e++;
        }
        return mini;
    }
}