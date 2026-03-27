class Solution {
    public List<List<String>> solveNQueens(int n) {  
        List<List<String>> ans = new ArrayList<>();
        List<String> temp = new ArrayList<>();
        for(int i=0; i<n; i++){
            char row[] = new char[n];
            Arrays.fill(row,'.');
            temp.add(new String(row));
        }

        solve(0, temp, ans, n);          
        return ans;
    }
    public void solve(int col, List<String> temp, List<List<String>> ans, int n){
        if(col == n){
            ans.add(new ArrayList(temp));
            return;
        }
        for(int row=0; row<n; row++){
            if(issafe(col, row, temp,n)){
                char[] rowarray = temp.get(row).toCharArray();
                rowarray[col] = 'Q';
                temp.set(row, new String(rowarray));
                solve(col+1, temp, ans, n);
                rowarray[col] = '.';
                temp.set(row, new String(rowarray));
            }

        }

    } 
    public boolean issafe(int col, int row, List<String> temp, int n){
        int duprow = row;
        int dupcol = col;

        //upper diagnol
        while( row >= 0 && col >=0){
            if(temp.get(row).charAt(col) == 'Q') return false;
            row--;
            col--;
        }
        // left straight
        row = duprow;
        col = dupcol;
        while(col >= 0){
            if(temp.get(row).charAt(col) == 'Q') return false;
            col--;
        }
        //lower diagnol
        row = duprow;
        col = dupcol;
        while(row< n && col >=0){
            if(temp.get(row).charAt(col) == 'Q') return false;
            row++;
            col--;
        }
        return true;
    }
}