class Solution {
    public int findHIndex(int citations[],int mid)
    {
        int c=0;
        for(int i=0;i<citations.length;i++)
        {
            if(citations[i]>mid)
            c++;
        }
        return c;
    }
    public int hIndex(int[] citations) {
        // code here
        int l=0;//Arrays.stream(citations).min().getAsInt();
        int h=Arrays.stream(citations).max().getAsInt();
        
        while(l<h)
        {
            int mid=l+(h-l)/2;
            
            int h_idx=findHIndex(citations,mid);
            
            if(h_idx>mid)
            l=mid+1;
            else
            h=mid;
        }
        return l;
    }
}