class Solution {
    public int[] prevSmallerElem(int arr[])
    {
        int n=arr.length;
        int ans[]=new int[n];
        Stack<Integer> st=new Stack<>();

        int x=0;
        for(int i=0;i<arr.length;i++)
        {
            while(!st.isEmpty() && arr[i]<=arr[st.peek()])
            st.pop();

            if(st.isEmpty())
            ans[x++]=-1;
            else
            ans[x++]=st.peek();

            st.push(i);
        }
        return ans;
    }
    public int[] nextSmallerElem(int arr[])
    {
        int n=arr.length;
        int ans[]=new int[n];
        Stack<Integer> st=new Stack<>();

        int x=arr.length-1;
        for(int i=arr.length-1;i>=0;i--)
        {
            while(!st.isEmpty() && arr[i]<=arr[st.peek()])
            st.pop();

            if(st.isEmpty())
            ans[x--]=n;
            else
            ans[x--]=st.peek();

            st.push(i);
        }
        return ans;
    }
    public int largestHistogramArea(int heights[])
    {
        int pse[]=prevSmallerElem(heights);
        int nse[]=nextSmallerElem(heights);
        
        int max_area=0,area;
        for(int i=0;i<heights.length;i++)
        {
            int leftElem=i-pse[i];
            int rightElem=nse[i]-i;

            area=heights[i]*(leftElem+rightElem-1);
            max_area=Math.max(max_area,area);
        }
        return max_area;
    }
    public int maximalRectangle(char[][] matrix) 
    {
        int max_area=0,histArea=0;
        int row=matrix.length,col=matrix[0].length,sum=0;
        int heights[]=new int[col];
        
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(matrix[i][j]=='0')
                heights[j]=0;
                else
                heights[j]=heights[j]+(matrix[i][j]-'0');

                // System.out.print(heights[j]+" ");
            }

            histArea=largestHistogramArea(heights);
            max_area=Math.max(max_area,histArea);
            
            // System.out.println();
        }
        // for(int i=0;i<col;i++)
        // {
        //     heights[i]=matrix[0][i]-'0';
        //     // System.out.println(heights[i]);
            
        // }

        // for(int i=1;i<row;i++)
        // {
        //     histArea=largestHistogramArea(heights);
        //     max_area=Math.max(max_area,histArea);
        //     System.out.println(max_area);
        //     for(int j=0;j<col;j++)
        //     {
        //         heights[i]=heights[i-1]+(matrix[i][j]-'0');
        //     }
        // }
        // max_area=Math.max(max_area,histArea);

        return max_area;
        
    }
}