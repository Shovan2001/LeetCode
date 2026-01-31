class Solution {
    static ArrayList<Integer> preGreaterEle(int[] arr) {
        // code here
        Stack<Integer> st=new Stack<>();
        st.push(0);
        
        ArrayList<Integer> ans=new ArrayList<>();
        ans.add(-1);
        
        for(int i=1;i<arr.length;i++)
        {
            while(!st.isEmpty() && arr[st.peek()]<=arr[i])
            {
                st.pop();
            }
            if(!st.isEmpty() && arr[st.peek()]>arr[i])
            {
                ans.add(arr[st.peek()]);
                st.push(i);
            }
            else // if(st.isEmpty())
            {
                ans.add(-1);
                st.push(i);
            }
            
            // else
            // {
            //     ans.add(arr[st.peek()]);
            //     st.push(i);
            // }
        }
        return ans;
    }
}