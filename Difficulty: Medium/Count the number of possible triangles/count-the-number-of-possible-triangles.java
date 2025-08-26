class Solution {
    public int modBinSearch(int arr[],int l,int h,int k)
    {
        while(l<h)
        {
            int mid=l+(h-l)/2;
            
            if(arr[mid]<k)
            l=mid+1;
            else
            h=mid;
        }
        return l;
    }
    public int countTriangles(int arr[]) {
        // code here
        Arrays.sort(arr);
        
        int c=0;
        for(int i=0;i<arr.length;i++)
        {
            int firstSide=arr[i];
            
            for(int j=i+1;j<arr.length;j++)
            {
                int secSide=arr[j];
                
                int sum=firstSide+secSide;
                
                int x=modBinSearch(arr,j+1,arr.length,sum);
                
                int trig_possible=x-(j+1);
                c+=trig_possible;
            }
        }
        return c;
    }
}