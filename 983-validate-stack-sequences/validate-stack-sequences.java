class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) 
    {
        Stack<Integer> st=new Stack<>();

        int n=pushed.length,x=0;
        for(int i=0;i<n;i++)
        {
            st.push(pushed[i]);

            while(!st.isEmpty() && x<n && popped[x]==st.peek())
            {
                x++;
                st.pop();
            }
        }
        if(st.isEmpty())
        return true;
        return false;
    }
}