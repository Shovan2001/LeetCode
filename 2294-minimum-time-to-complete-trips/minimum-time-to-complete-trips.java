class Solution { 
    long no_of_trips_in_given_time(int time[],long given_time)
    {
        long ans=0;
        for(int i=0;i<time.length;i++)
        {
            ans+=(given_time/time[i]);
        }
        return ans;
    }
    public long minimumTime(int[] time, int totalTrips) {
        
        //As not sorted not using min elem of bin srch
        long min=Long.MAX_VALUE;
        for(int i=0;i<time.length;i++)
        {
            min=Math.min(min,time[i]);
        }
        
        long l=1,h=totalTrips*min;
        System.out.println(h);
        while(l<h)
        {
            long mid=l+(h-l)/2;

            //can we complete totalTrips in mid time??
            //if yes then surely i will complete the trips in mid+1,mid+2,mid+3... time
            //so mid is my possible answer 
            //to minimize i must try a lesser time so i need to push towars the left to find the min answer
            long tot_trips_in_given_time=no_of_trips_in_given_time(time,mid);

            if(tot_trips_in_given_time<totalTrips)
            l=mid+1;
            else
            h=mid;
        }

        return l;
    }
}