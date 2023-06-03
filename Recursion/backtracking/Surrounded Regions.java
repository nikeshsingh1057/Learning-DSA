//  Surrounded Regions 130
//  https://leetcode.com/problems/surrounded-regions/

class Solution {
    public void solve(char[][] board) {
        
        char temp[][]=new char[board.length][board[0].length];
        
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                temp[i][j]=board[i][j];
            } 
        }
        
        for(int i=0;i<temp.length;i++){
            for(int j=0;j<temp[0].length;j++){
                
                if(i==0 || j==0 || i==temp.length-1 || j==temp[0].length-1) 
                    DFS(i,j,temp);
            }
        }
        
        for(int i=0;i<temp.length;i++){
            for(int j=0;j<temp[0].length;j++){
                
                if(temp[i][j]=='T')
                    board[i][j]='O';
                
                else
                    board[i][j]='X';
            }
        }
    }
    public static void DFS(int i,int j,char [][] temp){
        
        if(i<0 || j<0 || i>=temp.length || j>=temp[0].length || temp[i][j]=='X' || temp[i][j]=='T')
            return;
        
        temp[i][j]='T'; // isko 1 bana diye taki sare 0 se connected link 1 ho jaye.
            
        DFS(i-1,j,temp);
        DFS(i+1,j,temp);
        DFS(i,j-1,temp);
        DFS(i,j+1,temp);
    }
}
