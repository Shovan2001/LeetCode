class Solution {
    // public int findMin(int arr[],int s,int e)
    // {
    //     int min=Integer.MAX_VALUE;
    //     for(int i=s;i<=e;i++)
    //     {
    //         if(arr[i]<min)
    //         min=arr[i];
    //     }
    //     return min;
    // }
    // public int sumSubMins(int[] arr) {
    //     // code here
    //     int n=arr.length,min_sum=0;
        
    //     for(int i=0;i<n;i++)
    //     {
    //         for(int j=i;j<n;j++)
    //         {
    //             min_sum+=findMin(arr,i,j);
    //         }
    //     }
    //     return min_sum;
    // }
    public int[] findNextSmallerElem(int arr[],int n)
    {
        
        int nse[] = new int[n];
        nse[n-1]=n;
        
        Stack<Integer> st=new Stack<>();
        st.push(n-1);
        
        int x=n-2;
        for(int i=n-2;i>=0;i--)
        {
            while(!st.isEmpty() && arr[i]<arr[st.peek()])
            st.pop();
            
            if(st.isEmpty())
            nse[x--]=n;
            else
            nse[x--]=st.peek();
            
            st.push(i);
            
        }
        return nse;
    }
    public int[] findPrevSmallerElem(int arr[],int n)
    {
        
        int pse[] = new int[n];
        pse[0]=-1;
        
        Stack<Integer> st=new Stack<>();
        st.push(0);
        
        int x=1;
        for(int i=1;i<n;i++)
        {
            while(!st.isEmpty() && arr[i]<=arr[st.peek()])
            st.pop();
            
            if(st.isEmpty())
            pse[x++]=-1;
            else
            pse[x++]=st.peek();
            
            st.push(i);
            
        }
        return pse;
    }
    public int sumSubMins(int[] arr) {
        // code here
        int n=arr.length;
        
        int pse[]= findPrevSmallerElem(arr,n);
        int nse[]= findNextSmallerElem(arr,n);
        
        int ans=0;
        
        // for(int i=0;i<n;i++)
        // {
        //     System.out.print(pse[i]+" ");
        // }
        
        // System.out.println();
        
        // for(int i=0;i<n;i++)
        // {
        //     System.out.print(nse[i]+" ");
        // }
        for(int i=0;i<n;i++)
        {
            int pse_dist=i-pse[i];
            int nse_dist=nse[i]-i;
            
            ans+=arr[i]*pse_dist*nse_dist;
        }
        //System.out.println();
        return ans;
    }
}
