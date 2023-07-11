public class K_Night_Combination {

    // all possible way to place knight in 2d chess board.
    // isme combination nikalana hai.(no need to check that they kill one another)

    public static void main(String[] args) {
        
        int n=2;        // e.g 2*2 me 3 queen place karna hai       so 4c3 way.

        knightPlace(0,0,3,"",n,2);
    }
    public static void knightPlace(int r,int c,int qtp,String ans,int tot_r ,int tot_c)
    {
        if(qtp==0)
        {
            System.out.println(ans);
            return;
        }
        if(c==tot_c)
        {
            r++;
            c=0;
        }
        if(r==tot_r)
            return;
        
        knightPlace(r, c+1, qtp-1,ans+"k{"+r+","+c+"}", tot_r, tot_c);
        knightPlace(r, c+1, qtp, ans, tot_r, tot_c);
    }
}
// k{0,0}k{0,1}k{1,0}
// k{0,0}k{0,1}k{1,1}
// k{0,0}k{1,0}k{1,1}
// k{0,1}k{1,0}k{1,1}
