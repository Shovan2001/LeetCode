class Solution {
    public double timeRequiredAtSpeedMid(int[] dist, int speed)
    {
        double time_taken=0;
        for(int i=0;i<dist.length-1;i++)
        {
            if(dist[i]%speed!=0)
                time_taken+=(dist[i]/speed)+1;
            else
                time_taken+=(dist[i]/speed);
        }
        
        time_taken+=((double)dist[dist.length-1]/(double)speed);

        return time_taken;
    }
    public int minSpeedOnTime(int[] dist, double hour) {

        if(hour<dist.length-1)
        return -1;

        int l=1,h=(int)10e7;//Arrays.stream(dist).max().getAsInt();

        while(l<h)
        {
            int mid=l+(h-l)/2;

            double hoursReq=timeRequiredAtSpeedMid(dist,mid);
            
            if(hoursReq>hour)
            l=mid+1;
            else
            h=mid;
        }
        if(l==10e7)
        return -1;
        else
        return l;
    }
}