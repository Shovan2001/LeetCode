class Solution {
    
    static void insertAtBottom(Stack<Integer>st, int elem)
    {
        if(st.isEmpty())
        {
            st.push(elem);
            return;
        }
        
        int top=st.pop();
        insertAtBottom(st,elem);
        st.push(top);
    }
    public static void reverseStack(Stack<Integer> st) {
        // code here
        if(st.isEmpty() || st.size()==1)
        return;
        
        int top=st.pop();
        
        reverseStack(st);
        insertAtBottom(st,top);
    }
}
