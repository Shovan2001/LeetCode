class Solution {
    public ArrayList<Integer> calculateSpan(int[] arr) {
        // code here
        
        ArrayList<Integer> ans=new ArrayList<>();
        // ans.add(1);
        
        Stack<Integer> st=new Stack<>();
        // st.add(0);
        
        int n=arr.length;
        
        for(int i=0;i<n;i++)
        {
            while(!st.isEmpty() && arr[i]>=arr[st.peek()])
            st.pop();
            
            if(st.isEmpty())
            {
                ans.add(i+1);
            }
            else
            {
                ans.add(i-st.peek());
            }
            
            st.push(i);
        }
        return ans;
    }
}