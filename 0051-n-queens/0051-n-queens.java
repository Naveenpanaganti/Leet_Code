class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        List<String> board = new ArrayList<>();
        for(int i=0; i<n; i++){
            char[] row = new char[n];
            Arrays.fill(row, '.');
            board.add(new String(row));
        }
        solve(0, ans, board, n);
        return ans;      
    }
    public void solve(int col, List<List<String>> ans, List<String> board, int n){
        if(col ==n){
            ans.add(new ArrayList(board));
            return;
        }
        for(int row=0;row<n;row++){
            if(issafe(row,col, board, n)){
                char[] rowArray = board.get(row).toCharArray();  
                rowArray[col] = 'Q'; 
                board.set(row, new String(rowArray));
                solve(col+1, ans, board, n);
                rowArray[col] = '.';
                board.set(row, new String(rowArray));
            }
        }

    }
    public boolean issafe(int row, int col, List<String> board, int n){
        int r = row; 
        int c = col;
        //upper diagonal
        while(row >=0 && col >= 0){
            if(board.get(row).charAt(col)=='Q') return false;
            row--;
            col--;
        }
        // left side
        col =c;
        row = r;
        while(col >=0){
            if(board.get(row).charAt(col)=='Q') return false;
            col--;
        }
        //lower diagonal
        col = c;
        row = r;
        while(row <n && col >= 0){
            if(board.get(row).charAt(col)=='Q') return false;
            row++;
            col--;
        }
        return true;
    }
}