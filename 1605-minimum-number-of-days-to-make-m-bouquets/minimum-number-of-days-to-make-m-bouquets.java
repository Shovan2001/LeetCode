class Solution {
    public int bloomingAtDayMid(int[] bloomDay, int day,int perBouquetFlower) 
    {
        int flowers=0,adj_flowers=0;
        int bouquet=0;
        for(int i=0;i<bloomDay.length;i++)
        {
            if(bloomDay[i]<=day)
            flowers++;
            if(bloomDay[i]>day || i==bloomDay.length-1)
            {
                adj_flowers=flowers;
                flowers=0;
                
                bouquet+=adj_flowers/perBouquetFlower;
            }
        }
        //System.out.println(bouquet);
        
        return bouquet;
    }

    public int minDays(int[] bloomDay, int m, int k) {
    
        if(m>bloomDay.length/k)
        return -1;

        int l=Arrays.stream(bloomDay).min().getAsInt();
        int h=Arrays.stream(bloomDay).max().getAsInt();
        
        while(l<h)
        {
            int mid=l+(h-l)/2;

            int no_of_bouquet= bloomingAtDayMid(bloomDay,mid,k);

            if(no_of_bouquet<m)
            l=mid+1;
            else
            h=mid; 
        }
        return l;
    }
}