class Solution {
    public int[] findPrevSmaller(int arr[])
    {
        int pse[]=new int[arr.length];
        int x=0;
        
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<arr.length;i++)
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
    
    public int[] findNextSmaller(int arr[])
    {
        int nse[]=new int[arr.length];
        int x=arr.length-1;
        
        Stack<Integer> st=new Stack<>();
        for(int i=arr.length-1;i>=0;i--)
        {
            while(!st.isEmpty() && arr[i]<arr[st.peek()])
            st.pop();
            
            if(st.isEmpty())
            nse[x--]=arr.length;
            else
            nse[x--]=st.peek();
            
            st.push(i);
        }
        
        return nse;
    }
    public int sumSubMins(int[] arr) {
        // code here
        int pse[]=findPrevSmaller(arr);
        int nse[]=findNextSmaller(arr);
        
        // for(int i=0;i<nse.length;i++)
        // {
        //     System.out.print(nse[i]+" ");
        // }
        int ans=0;
        for(int i=0;i<arr.length;i++)
        {
            int left_elem=i-pse[i];
            int right_elem=nse[i]-i;
            
            ans+=arr[i]*right_elem*left_elem;
        }
        
        return ans;
    }
}
