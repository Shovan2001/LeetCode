class Solution {
public:
    bool solve(vector<vector<char>>& board,int i,int j,int m,int n,int idx,string word)
    {
        if(idx==word.length())
        return true;

        if(i<0 || j<0 || i==m || j==n || board[i][j]!=word[idx])
        return false;

        char temp=board[i][j];
        board[i][j]='$';
        
        bool op1=solve(board,i+1,j,m,n,idx+1,word);
        bool op2=solve(board,i-1,j,m,n,idx+1,word);
        bool op3=solve(board,i,j+1,m,n,idx+1,word);
        bool op4=solve(board,i,j-1,m,n,idx+1,word);

        board[i][j]=temp;

        return (op1 || op2 || op3 || op4);
    }
    bool exist(vector<vector<char>>& board, string word) 
    {
        int m=board.size();
        int n=board[0].size();
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(board[i][j]==word[0])
                {
                    if(solve(board,i,j,m,n,0,word))
                        return true;
                }
            }
        }
        return false;
    }
};