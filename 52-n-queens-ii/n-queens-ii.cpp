class Solution {
public:
    bool isSafe(int row,int col,vector<string> &board,int n)
    {
        int dup_row=row;
        int dup_col=col;
        
        //upper-left
        while(dup_row>=0 && dup_col >=0)
        {
            if(board[dup_row][dup_col]=='Q')
            return false;
            dup_row--;
            dup_col--;
        }

        //reset
        dup_row=row;
        dup_col=col;
        //left
        while(dup_col>=0)
        { 
            if(board[dup_row][dup_col]=='Q')
            return false;
            dup_col--;
        }

        //reset
        dup_row=row;
        dup_col=col;
        //bottom-left
        while(dup_col>=0 && dup_row<n)
        {
            if(board[dup_row][dup_col]=='Q')
            return false;
            dup_col--;
            dup_row++;
        }
        return true;
    }
    void solve(int col,vector<string> &board,vector<vector<string>>&ans,int n)
    {
        if(col==n)
        {
            ans.push_back(board);
        }

        for(int row=0;row<n;row++)
        {
            if(isSafe(row,col,board,n))
            {
                board[row][col]='Q';
                solve(col+1,board,ans,n);
                board[row][col]='.';
            }
        }
    }
    int totalNQueens(int n) {
        vector<vector<string>> ans;
        vector<string> board(n);
        string s(n, '.');
        for (int i = 0; i < n; i++) {
            board[i] = s;
        }
        
        solve(0, board, ans, n);
        
        return ans.size();
    }
};