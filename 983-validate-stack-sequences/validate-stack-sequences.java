class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) 
    {
        Stack<Integer> st=new Stack<>();

        int n=pushed.length,x=0;
        for(int i=0;i<n;i++)
        {
            st.push(pushed[i]);

            while(!st.isEmpty() && popped[x]==st.peek() && x<n)
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