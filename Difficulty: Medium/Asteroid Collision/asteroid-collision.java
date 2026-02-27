// User function Template for Java

class Solution {
    public static int[] asteroidCollision(int N, int[] asteroids) {
        // code here
        Stack<Integer> st=new Stack<>();
        
        for(int i=0;i<N;i++)
        {
            if(asteroids[i]>0)
            st.push(asteroids[i]);
            else
            {
                
                while(!st.isEmpty() && st.peek()>0 && Math.abs(asteroids[i])>st.peek())
                st.pop();
            
                if(st.isEmpty() || st.peek()<0)
                st.push(asteroids[i]);
            
                if(st.peek()==Math.abs(asteroids[i]))
                st.pop();
            }
        }
        
        int ans[]=new int[st.size()];
        int x=st.size()-1;
        
        while(!st.isEmpty())
        ans[x--]=st.pop();
        
        return ans;
    }
}
