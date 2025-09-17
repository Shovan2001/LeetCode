class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        // code here
        int n=arr.length;
        ArrayList<Integer> ans=new ArrayList<>();
        ans.add(-1);
        
        Stack<Integer>st=new Stack<>();
        st.push(arr[n-1]);
        
        for(int i=n-2;i>=0;i--)
        {
            if(arr[i]<st.peek())
            {
                ans.add(st.peek());
                st.push(arr[i]);
            }
            else
            {
                while(!st.isEmpty())
                {
                    st.pop();
                    if(!st.isEmpty() && st.peek()>arr[i])
                    {
                        ans.add(st.peek());
                        st.push(arr[i]);
                        break;
                    }
                }
                if(st.isEmpty())
                {
                    ans.add(-1);
                    st.push(arr[i]);
                }
            }
        }
        Collections.reverse(ans);
        return ans;
    }
}