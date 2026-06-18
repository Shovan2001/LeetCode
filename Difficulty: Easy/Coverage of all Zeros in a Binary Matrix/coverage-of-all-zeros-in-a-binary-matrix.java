class Solution {
    public int findCoverage(int[][] mat) {
        // code here
        
        int all_cov=0;
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[0].length;j++)
            {
                int tot_cov=0;
            
                if(mat[i][j]==0)
                {
                    int r=i,c=j;
                    int top_cov=0,down_cov=0,left_cov=0,right_cov=0;
                    
                    //top
                    while(r>=0)
                    {
                        if(mat[r][j]==1)
                        {
                            top_cov++;
                            break;
                        }
                        r--;
                        
                    }
                    
                    r=i;
                    c=j;
                    //down
                    while(r<mat.length)
                    {
                        if(mat[r][j]==1)
                        {
                            down_cov++;
                            break;
                        }
                        r++;
                    }
                    
                    r=i;
                    c=j;
                    //left
                    while(c>=0)
                    {
                        if(mat[i][c]==1)
                        {
                            left_cov++;
                            break;
                        }
                        c--;
                    }
                    
                    r=i;
                    c=j;
                    //right
                    while(c<mat[0].length)
                    {
                        if(mat[i][c]==1)
                        {
                            right_cov++;
                            break;
                        }
                        c++;
                    }
                    
                    tot_cov+=top_cov+down_cov+left_cov+right_cov;
                }
                
                all_cov+=tot_cov;
            }
        }
        
        return all_cov;
    }
}