class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        // code here
        int n=arr.length;
        
        Stack<Integer> st=new Stack<>();
        st.push(n-1);
        
        ArrayList<Integer> ans=new ArrayList<>();
        ans.add(-1);
        
        for(int i=n-2;i>=0;i--)
        {
            while(!st.isEmpty() && arr[i]>=arr[st.peek()])
            {
                st.pop();
            }
            if(st.isEmpty())
            {
                ans.add(-1);
            }
            else
            {
                ans.add(arr[st.peek()]);
            }
            
            st.push(i);
        }
        
        Collections.reverse(ans);
        
        return ans;
    }
}