class Solution {
    public int[] canSeePersonsCount(int[] heights) 
    {
        int n=heights.length;
        int ans[]=new int[n];
        ans[n-1]=0;

        Stack<Integer> st=new Stack<>();
        st.push(n-1);

        for(int i=n-2;i>=0;i--)
        {
            while(!st.isEmpty() && heights[i]>=heights[st.peek()])
            {
                st.pop();
                ans[i]++;
            }

            if(!st.isEmpty())
                ans[i]++;
            
            st.push(i);
        }

        return ans;
    }
}