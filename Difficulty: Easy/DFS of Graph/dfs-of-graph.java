class Solution {
    void find_dfs(ArrayList<Integer> ans,ArrayList<ArrayList<Integer>> adj,Set<Integer>found, int u)
    {
        found.add(u);
        ans.add(u);
        
        for(int i=0;i<adj.get(u).size();i++)
        {
            int v=adj.get(u).get(i);
            
            if(!found.contains(v))
                find_dfs(ans,adj,found,v);
        }
    }
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        
        ArrayList<Integer> ans=new ArrayList<>();
        
        Set<Integer>found=new HashSet<>();
        
        
        for(int i=0;i<adj.size();i++)
        {
            if(!found.contains(i))
                find_dfs(ans,adj,found,i);
        }
        
        return ans;
    }
}