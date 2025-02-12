class Solution {
    public void setZeroes(int[][] matrix) 
    {
        int row=matrix.length;
        int col=matrix[0].length;

        int check_rows[]=new int[row];
        int check_cols[]=new int[col];

        Arrays.fill(check_rows,0);
        Arrays.fill(check_cols,0);

        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(matrix[i][j]==0)
                {
                    check_rows[i]=-1;
                    check_cols[j]=-1;
                }
            }
        }
        
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(check_rows[i]==-1 || check_cols[j]==-1)
                matrix[i][j]=0;
            }
        }
    }
}