class Solution {
    void find_bfs(ArrayList<Integer> ans,ArrayList<ArrayList<Integer>> adj,Set<Integer>found, int u)
    {
        Queue<Integer> q=new LinkedList<>();
        
        q.add(u);
        found.add(u);
        ans.add(u);
        
        while(!q.isEmpty())
        {
            int front=q.poll();
            
            for(int v: adj.get(front))
            {
                if(!found.contains(v))
                {
                    q.add(v);
                    found.add(v);
                    ans.add(v);
                }
            }
        }
        
    }
    
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        ArrayList<Integer> ans=new ArrayList<>();
        Set<Integer>found=new HashSet<>();
        
        find_bfs(ans,adj,found,0);
        
        return ans;
    }
}