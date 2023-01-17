import java.util.ArrayList;

// find all path in maze with jump

public class maze_PathWith_Jump {
    public static void main(String[] args) {

        int n=3;
        int m=3;
        ArrayList<String> path=getMazw_withJump(1, 1, n, m);

        System.out.println(path);
        
    }
    public static ArrayList<String> getMazw_withJump(int sr,int sc,int dr,int dc)
    {
        if(sr==dr && sc==dc)
        {
            ArrayList<String> bres =new ArrayList<>();
            bres.add("");
            return bres;
        }
        ArrayList<String> paths =new ArrayList<>();

        // horizontal moves
        for(int ms=1; ms<=dc-sc; ms++)
        {
            ArrayList<String> hpaths=getMazw_withJump(sr, sc+ms, dr, dc);
            for(String hpath : hpaths)
                paths.add("h"+ ms + hpath);
        }

        // verticals moves
        for(int ms=1; ms<=dr-sr; ms++)
        {
            ArrayList<String> vpaths=getMazw_withJump(sr+ms, sc, dr, dc);
            for(String vpath : vpaths)
                paths.add("v" + ms + vpath);
        }

       // diagonal moves
        for(int ms=1; ms<=dc-sc && ms<=dr-sr; ms++)
        {
            ArrayList<String> dpaths=getMazw_withJump(sr+ms, sc+ms, dr, dc);
            for(String dpath:dpaths)
                paths.add("d"+ms+dpath);
        }
        return paths;
    }
}
