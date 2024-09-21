class Solution {
public:

    void solve(vector<vector<int>>& grid,int start_x,int start_y,int m,int n,int walkable,int walked,int &ans)
    {
        
        if(start_x<0 || start_y<0 || start_x==m ||start_y==n || grid[start_x][start_y]==-1)
        return;
        
        if(grid[start_x][start_y]==2)
        {
            if(walked==walkable)
                ans++;
            return;        
        }

        int temp=grid[start_x][start_y];
        grid[start_x][start_y]=-1;
        
        solve(grid,start_x+1,start_y,m,n,walkable,walked+1,ans);
        solve(grid,start_x,start_y+1,m,n,walkable,walked+1,ans);
        solve(grid,start_x-1,start_y,m,n,walkable,walked+1,ans);
        solve(grid,start_x,start_y-1,m,n,walkable,walked+1,ans);

        grid[start_x][start_y]=temp;
    }
    int uniquePathsIII(vector<vector<int>>& grid) 
    {
        int m=grid.size();
        int n=grid[0].size();
        int walkable=0,walked=0;
        int start_x,start_y;
        int ans=0;

        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(grid[i][j]==1)
                {
                    start_x=i;
                    start_y=j;
                }
                if(grid[i][j]==0 || grid[i][j]==1)
                  walkable++; 
            }
        }

        solve(grid,start_x,start_y,m,n,walkable,walked,ans);
        return ans;
    }
};