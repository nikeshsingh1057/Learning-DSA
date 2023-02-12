class Solution {
    
    static int ans=-1;
    static boolean f=false;
    public static int longestPath(int[][] mat,int n,int m,int xs,int ys,int xd,int yd) {
        
        f=false;
        ans=-1;
        
        MaxPath(mat,xs,ys,xd,yd,0);
        
        if(f==false)
            return -1;
            
        return ans;
    }
    public static void MaxPath(int[][] mat,int cr,int cc,int xd,int yd,int count)
    {
        if(cr==xd && cc==yd && mat[cr][cc]!=0)
        {
            f=true;
            ans = Math.max(ans,count);
            return;
        }
        
        if(cr<0 || cc<0 || cr>=mat.length || cc>=mat[0].length || mat[cr][cc]==0)
            return;
        
        mat[cr][cc]=0;
        
        int [] r= {-1,1,0,0};
        int [] c= {0,0,1,-1};
       
        for(int i=0;i<r.length;i++)
        {
            MaxPath(mat,cr+r[i],cc+c[i],xd,yd,count+1);
            
        }
         mat[cr][cc]=1;
    }
}
        
