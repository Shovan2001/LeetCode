class Solution {
    public int[] prevSmallerElem(int arr[])
    {
        int n=arr.length;
        int ans[]=new int[n];
        Stack<Integer> st=new Stack<>();

        int x=0;
        for(int i=0;i<arr.length;i++)
        {
            while(!st.isEmpty() && arr[i]<=arr[st.peek()])
            st.pop();

            if(st.isEmpty())
            ans[x++]=-1;
            else
            ans[x++]=st.peek();

            st.push(i);
        }
        return ans;
    }
    public int[] nextSmallerElem(int arr[])
    {
        int n=arr.length;
        int ans[]=new int[n];
        Stack<Integer> st=new Stack<>();

        int x=arr.length-1;
        for(int i=arr.length-1;i>=0;i--)
        {
            while(!st.isEmpty() && arr[i]<arr[st.peek()])
            st.pop();

            if(st.isEmpty())
            ans[x--]=n;
            else
            ans[x--]=st.peek();

            st.push(i);
        }
        return ans;
    }
    public int sumSubarrayMins(int[] arr) 
    {
        int prevSmaller[]=prevSmallerElem(arr);

        // for(int i=0;i<prevGret.length;i++)
        // {
        //     System.out.println(prevGret[i]);
        // }

        int nextSmaller[]=nextSmallerElem(arr);

        // for(int i=0;i<nextGret.length;i++)
        // {
        //     System.out.println(nextGret[i]);
        // }
        
        int mod=(int)1e9+7;
        long sum=0,left_elem,right_elem;
        for(int i=0;i<arr.length;i++)
        {
            left_elem=i-prevSmaller[i];
            right_elem=nextSmaller[i]-i;

            sum+=arr[i]*left_elem*right_elem%mod;
            sum%=mod;
        }
        return (int)sum;
    }
}