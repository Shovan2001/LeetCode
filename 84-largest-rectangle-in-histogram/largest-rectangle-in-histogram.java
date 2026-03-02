class Solution {
    public int[] prevSmallerElem(int heights[])
    {
        Stack<Integer>st=new Stack<>();
        int n=heights.length,x=0;
        int pse[]=new int[n];

        for(int i=0;i<n;i++)
        {
            while(!st.isEmpty() && heights[i]<=heights[st.peek()])
            st.pop();

            if(st.isEmpty())
            pse[x++]=-1;
            else
            pse[x++]=st.peek();

            st.push(i);
        }
        return pse;
    }
    
    public int[] nextSmallerElem(int heights[])
    {
        Stack<Integer>st=new Stack<>();
        int n=heights.length,x=n-1;
        int nse[]=new int[n];

        for(int i=n-1;i>=0;i--)
        {
            while(!st.isEmpty() && heights[i]<=heights[st.peek()])
            st.pop();

            if(st.isEmpty())
            nse[x--]=n;
            else
            nse[x--]=st.peek();

            st.push(i);
        }
        return nse;
    }
    public int largestRectangleArea(int[] heights) 
    {
        int pse[]=prevSmallerElem(heights);
        // for(int i=0;i<pse.length;i++)
        // {
        //     System.out.print(pse[i]+" ");
        // }
        // System.out.println();
        int nse[]=nextSmallerElem(heights);
        // for(int i=0;i<nse.length;i++)
        // {
        //     System.out.print(nse[i]+" ");
        // }
        int max_area=0,left_elem,right_elem;
        
        for(int i=0;i<heights.length;i++)
        {
            left_elem=i-pse[i];
            right_elem=nse[i]-i;

            int area=(left_elem+right_elem-1)*heights[i];
            max_area=Math.max(max_area,area);
        }

        return max_area;
    }
}