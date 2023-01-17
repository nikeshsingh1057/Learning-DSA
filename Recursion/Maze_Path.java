// print all maze path in matrix

public class Maze_Path {
    public static void main(String[] args) {
        
        getMaze(1,1,3,3,"");
    }
    public static void getMaze(int sr,int sc, int dr,int dc,String ans)
    {
        if(sr==dr && sc==dc)
        {
            System.out.print(ans+" ");
            return;
        }

        if(sr<dr)
            getMaze(sr+1, sc, dr, dc, ans+"h");  // increasing sr(source row ) with one if it is less than its boundary

        if(sc<dc)
            getMaze(sr, sc+1, dr, dc, ans+"v");  // increasing sc(source column ) with one if it is less than its boundary
    }
}
