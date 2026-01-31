class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        
        int n=temperatures.length;
        int ans[]=new int[n];
        ans[n-1]=0;

        Stack<Integer> st=new Stack<>();
        st.push(n-1);

        int x=n-2;
        for(int i=n-2;i>=0;i--)
        {
            while(!st.isEmpty() && temperatures[i]>=temperatures[st.peek()])
            st.pop();

            if(st.isEmpty())
            {
                ans[x--]=0;
            }
            else
            {
                ans[x--]=st.peek()-i;
            }
            st.push(i);
        }
        return ans;
    }
}