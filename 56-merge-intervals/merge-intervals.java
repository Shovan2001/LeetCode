class Solution {
    public int[][] merge(int[][] intervals) {

        Arrays.sort(intervals,(x,y)->x[0]-y[0]);

        List<int[]>ans=new ArrayList<>();
        int prev[]=intervals[0];

        for(int i=1;i<intervals.length;i++)
        {
            int interval[]=intervals[i];
            if(interval[0]<=prev[1])
            {
                prev[1]=Math.max(prev[1],interval[1]);
            }
            else
            {
                ans.add(prev);
                prev=interval;
            }
        }

        ans.add(prev);

        return ans.toArray(new int[ans.size()][]);
    }
}