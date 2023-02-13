public class N_Queen {     // pepcoding

    // note jitni row utni queen baithegi ,supoose row = 4 then 4 queen is possible to sit in matrix.
    public static void main(String[] args) {
        
        int n=4;

        int[][] chess=new int[n][n];

        printQueen(chess, " ", 0);
        
    }
    public static void printQueen(int[][] chess,String qsf,int row) // qsf-> queen so far
    {
        if(row==chess.length)
        {
            System.out.println(qsf);
            return;
        }

        for(int col=0;col<chess.length;col++)
        {
            if(isSafePlaceForQueen(chess,row,col)==true){

                chess[row][col]=1;
                printQueen(chess, qsf+row+"-"+col+", ", row+1);  // note har row me only one queen baithegi
                chess[row][col]=0;
            }
            
        }
    }
    // hume three direction me check karna hai.
    public static boolean isSafePlaceForQueen(int[][] chess,int row,int col)
    {
        for(int i=row-1,j=col; i>=0; i--)    // row me eak kam se start kiye hai.
        {
            if(chess[i][j]==1)
                return false;
        }

        for(int i=row-1,j=col-1; i>=0 && j>=0; i--,j--)   
        {
            if(chess[i][j]==1)
                return false;
        }

        for(int i=row-1,j=col+1; i>=0 && j<chess.length; i--,j++)    
        {
            if(chess[i][j]==1)
                return false;
        }
        return true;
    }
}

// 0-1, 1-3, 2-0, 3-2, 
//0-2, 1-0, 2-3, 3-1,
