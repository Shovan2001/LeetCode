class Solution {
    public List<String> buildArray(int[] target, int n) 
    {
        Stack<Integer> st=new Stack<>();
        List<String> ans=new ArrayList<>();

        int x=0;
        for(int i=1;i<=n;i++)
        {
            if(x==target.length)
            break;
            st.push(i);
            ans.add("Push");
            if(st.peek()!=target[x])
            {
                ans.add("Pop");
            }
            else
            {
                x++;
            }
        }
        return ans;
    }
}