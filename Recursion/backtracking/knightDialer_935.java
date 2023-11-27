// knight wala question hai see on leetcode
// https://leetcode.com/problems/knight-dialer/
class Solution {    // ans seen

        int mod = 1000000007;
        public int knightDialer(int n) {
        
        int[][] arr = {{0,0,0},{0,0,0},{0,0,0},{-1,0,-1} }; //array of valid and invalid keypad values
        
        int[][] qb = new int[12][n + 1]; //memoization
        
        int count = 0; //count of total phone numbers
        
        for (int i = 0; i < arr.length; i++) { //looping through each new starting point and finding all 
            
        //possible numerical phone no possible
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] != -1) {
                    count = (count + knightDialer2(arr, i, j, n - 1, qb)) % mod;
                }
            }
        }
        return count;
    }
    public int[][] dir = {//all knight moves
        {-2, 1},
        {-1,2},
        {1, 2},
        {2,1},
        {2,-1},
        {1,-2},
        {-1,-2},
        {-2,-1}
    };
    public int knightDialer2(int[][] arr, int row, int col, int n, int[][] qb) {
        
        if(row<0 || col<0 || row>=arr.length || col>=arr[0].length || arr[row][col] == -1)
            return 0;

        if (n == 0) {
            return 1;
        }
        if (qb[row + col + 2 * row][n] != 0) {
            return qb[row + col + 2 * row][n];
        }

        int nr;
        int nc;
        int count = 0;

        for (int[] d: dir) {

            nr = row + d[0];
            nc = col + d[1];

            count = (count + knightDialer2(arr, nr, nc, n - 1, qb)) % mod;
        }
        qb[row + col + 2 * row][n] = count;
        return count;
    }
}
