class Solution {
    public int[] nge(int nums2[])
    {
        int n=nums2.length;
        int nge[]=new int[n];
        nge[n-1]=-1;

        Stack<Integer>st=new Stack<>();
        st.push(nums2[n-1]);

        for(int i=nge.length-2;i>=0;i--)
        {
            while(!st.isEmpty() && nums2[i]>=st.peek())
            {
                st.pop();
            }

            if(st.isEmpty())
            nge[i]=-1;
            else
            nge[i]=st.peek();
        
            st.push(nums2[i]);   
        }

        return nge;
    }
    public int[] nextGreaterElement(int[] nums1, int[] nums2) 
    {
        int nge[]=nge(nums2);

        // for(int i=0;i<nge.length;i++)
        // System.out.println(nge[i]);

        // return new int[]{};
        Map<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<nge.length;i++)
        {
            mp.put(nums2[i],nge[i]);
        }

        int n=nums1.length;
        int ans[]=new int[n];
        for(int i=0;i<n;i++)
        {
            ans[i]=mp.get(nums1[i]);
        }

        return ans;

    }
}