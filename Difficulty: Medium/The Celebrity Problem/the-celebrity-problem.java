class Solution {
    public int celebrity(int mat[][]) {
        // code here
        int n=mat.length;
        
        for(int i=0;i<n;i++)
        {
            int c=0;
            for(int j=0;j<n;j++)
            {
                if(mat[i][j]==1)
                {
                    c++;
                }
                
            }
            
            if(c==1)
            {
                int x=0,cnt=0;
                while(x<n)
                {
                    if(mat[x][i]==1)
                        cnt++;
                    
                    x++;
                }
                if(cnt==n)
                return i;
            }
            
        }
        
        
        return -1;
    }
}