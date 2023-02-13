public class K_Night_Tour{

    // isme hume row column diya hua hai ussase ye print karna hai ke knight kis kis path ko follow kar ke
    // sare chess bord ko visit kar sakta hai. (see on gfg.)
    public static void main(String[] args) {
        
        int n=5;
        int r=2;
        int c=2;

        int [][] chess=new int[n][n];    // ye answer ka bhi work karega and visited mark karne ka bhee.
                                         // initially 0 fill hoga chess array me.

        KnightTour(chess,r,c,1);
    }
    public static void KnightTour(int [][] chess,int r,int c,int move)
    {
        if(r<0 || c<0 || r>=chess.length || c>=chess[0].length || chess[r][c]>0){
            return;
        }
        else if(move==chess.length*chess[0].length)
        {
            chess[r][c]=move;

            display(chess);
            System.out.println();

            chess[r][c]=0;

        }
        chess[r][c]=move; // marking visited. (it is also work for visiting not take extra visited array for checking.)

        KnightTour(chess, r-2, c+1, move+1);
        KnightTour(chess, r-1, c+2, move+1);
        KnightTour(chess, r+1, c+2, move+1);
        KnightTour(chess, r+2, c+1, move+1);
        KnightTour(chess, r+2, c-1, move+1);
        KnightTour(chess, r+1, c-2, move+1);
        KnightTour(chess, r-1, c-2, move+1);
        KnightTour(chess, r-2, c-1, move+1);

        chess[r][c]=0;
        
    }
    public static void display(int[][] chess)
    {
        for(int i=0;i<chess.length;i++)
        {
            for(int j=0;j<chess[0].length;j++)
            {
                System.out.print(chess[i][j]+" ");
            }
            System.out.println();
        }
    }
}
