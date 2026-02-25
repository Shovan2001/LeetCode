class Solution {
    static boolean isIntersect(int[][] intervals) {
        // Code Here
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        
        for(int i=1;i<intervals.length;i++)
        {
            if(intervals[i][0]<=intervals[i-1][1])
            return true;
        }
        return false;
    }
}