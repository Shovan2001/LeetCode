class Solution {
    public int assignHole(int[] mices, int[] holes) {
        // code here
        Arrays.sort(mices);
        Arrays.sort(holes);
        
        int diff,maxDiff=Integer.MIN_VALUE;
        for(int i=0;i<mices.length;i++)
        {
            diff=Math.abs(mices[i]-holes[i]);
            
            maxDiff=Math.max(maxDiff,diff);
        }
        return maxDiff;
    }
};