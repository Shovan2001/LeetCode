class Solution {
    
    boolean findWholeWord(char[][] mat,int i,int j,int row,int col, String word,int idx)
    {
        if(idx==word.length())
        return true;
        
        if(i<0 || j<0 || i>=row || j>=col || mat[i][j]=='$')
        return false;
        
        if(word.charAt(idx)!=mat[i][j])
        return false;
        
        char x=mat[i][j];
        mat[i][j]='$';
        
        //UP
        if(findWholeWord(mat,i-1,j,row,col,word,idx+1))
        return true;
        //DOWN
        if(findWholeWord(mat,i+1,j,row,col,word,idx+1))
        return true;
        //LEFT
        if(findWholeWord(mat,i,j-1,row,col,word,idx+1))
        return true;
        //RIGHT
        if(findWholeWord(mat,i,j+1,row,col,word,idx+1))
        return true;
        
        mat[i][j]=x;
        
        return false;
       
    }
    public boolean isWordExist(char[][] mat, String word) {
        // Code here
        int row=mat.length,col=mat[0].length;
        
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(mat[i][j]==word.charAt(0) && findWholeWord(mat,i,j,row,col,word,0))
                return true;
            }
        }
        
        return false;
    }
}