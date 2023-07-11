public class K_Night_no_Kill {
    public static void main(String[] args) {
        
        int n=3;
        boolean board[][]=new boolean[n][n];

        knightPlace(0,0,board,"",n);
    }
    public static void knightPlace(int r,int c, boolean [][] board,String ans,int qtp)
    {
        if(qtp==0)
        {
            System.out.println(ans);
            return;
        }
        if(c==board[0].length) // here column 0 kar de rahe and row ko increse kar de rahe hai.
        {
            r++;
            c=0;
        }
        if(r==board.length)
            return;
        
        if(isitsafemove(board,r,c)==true){

            board[r][c]=true;
            knightPlace(r,c+1,board,ans+"k{"+r+","+c+"}",qtp-1);
            board[r][c]=false; 
        }
       knightPlace(r, c+1, board, ans, qtp);
    }
    public static boolean isitsafemove(boolean[][] board,int r,int c)
    {
        //left
        if(r-1>=0 && c-2>=0 && board[r-1][c-2]==true)
            return false;

        // right
        if(r-1>=0 && c+2<board.length && board[r-1][c+2]==true)
            return false;

        // upper left
        if(r-2>=0 && c-1>=0 && board[r-2][c-1]==true)
            return false;

        // upper right
        if(r-2>=0 && c+1<board.length && board[r-2][c+1]==true)
            return false;
        
        return true;
        
        // we merge in  single loop 
        /*int rm[]={-1,-1,-2,-2};
        int cm[]={-2,2,-1,1};

        for(int i=0;i<rm.length;i++)
        {
            int a=rm[i];
            int b=cm[i];
            if(a+r>=0 && b+c>=0 && b+c<board.length){

                if(board[r+a][c+b]==true)
                return false;
            }
        }
        return true;*/
    }
}
/* output of if n=2*/

/*k{0,0}k{0,1}k{0,2}
k{0,0}k{0,1}k{1,0}
k{0,0}k{0,1}k{1,1}
k{0,0}k{0,2}k{1,1}
k{0,0}k{0,2}k{2,0}
k{0,0}k{0,2}k{2,2}
k{0,0}k{1,0}k{1,1}
k{0,0}k{1,0}k{2,0}
k{0,0}k{1,1}k{2,0}
k{0,0}k{1,1}k{2,2}
k{0,0}k{2,0}k{2,2}
k{0,1}k{0,2}k{1,1}
k{0,1}k{0,2}k{1,2}
k{0,1}k{1,0}k{1,1}
k{0,1}k{1,0}k{1,2}
k{0,1}k{1,0}k{2,1}
k{0,1}k{1,1}k{1,2}
k{0,1}k{1,1}k{2,1}
k{0,1}k{1,2}k{2,1}
k{0,2}k{1,1}k{1,2}
k{0,2}k{1,1}k{2,0}
k{0,2}k{1,1}k{2,2}
k{0,2}k{1,2}k{2,2}
k{0,2}k{2,0}k{2,2}
k{1,0}k{1,1}k{1,2}
k{1,0}k{1,1}k{2,0}
k{1,0}k{1,1}k{2,1}
k{1,0}k{1,2}k{2,1}
k{1,0}k{2,0}k{2,1}
k{1,1}k{1,2}k{2,1}
k{1,1}k{1,2}k{2,2}
k{1,1}k{2,0}k{2,1}
k{1,1}k{2,0}k{2,2}
k{1,1}k{2,1}k{2,2}
k{1,2}k{2,1}k{2,2}
k{2,0}k{2,1}k{2,2}*/
