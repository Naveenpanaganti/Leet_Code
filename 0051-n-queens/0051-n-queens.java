class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        List<String> temp = new ArrayList<>();
        String s =".".repeat(n);
        for(int i=0;i<n;i++){
            temp.add(s);
        }
        int[] leftrow = new int[n];
        int[] upperdiaganol = new int[n*2-1];
        int[] lowerdiaganol = new int[n*2-1];
        Solve(0, n, leftrow, upperdiaganol, lowerdiaganol, temp, ans);
        return ans;
    }
    public void Solve(int col, int n, int[] leftrow, int[] upperdiaganol, int[] lowerdiaganol, List<String> temp, List<List<String>> ans){
        if(col >=  n){
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int row=0; row<n; row++){
            if(leftrow[row] == 0 && upperdiaganol[row+col] == 0 && lowerdiaganol[(n-1)+(col-row)] == 0){
                char[] rowarray = temp.get(row).toCharArray();
                rowarray[col] = 'Q';
                temp.set(row, new String(rowarray));

                leftrow[row] =1;
                upperdiaganol[row+col] = 1;
                lowerdiaganol[(n-1)+(col-row)] =1;

                Solve(col+1, n, leftrow, upperdiaganol, lowerdiaganol, temp, ans);
                rowarray[col]='.';
                temp.set(row, new String(rowarray));
                leftrow[row] =0;
                upperdiaganol[row+col] = 0;
                lowerdiaganol[(n-1)+(col-row)] = 0;

            }


        }
    }
}