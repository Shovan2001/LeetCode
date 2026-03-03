class Solution {
    public int totalElements(int[] arr) {
        // code here
        int j=0,ans=Integer.MIN_VALUE;
        Map<Integer,Integer> mp=new HashMap<>();
        
        for(int i=0;i<arr.length;i++)
        {
            mp.put(arr[i],mp.getOrDefault(arr[i],0)+1);
            
            if(mp.size()>2)
            {
                mp.put(arr[j],mp.get(arr[j])-1);
                
                if(mp.get(arr[j])==0)
                mp.remove(arr[j]);
                
                j++;
            }
            
            ans=Math.max(ans,i-j+1);
        }
        
        return ans;
    }
}