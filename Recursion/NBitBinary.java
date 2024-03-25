// Print N-bit binary numbers having more 1s than 0s
// https://www.geeksforgeeks.org/problems/print-n-bit-binary-numbers-having-more-1s-than-0s0252/1    (gfg)

class Solution { //own
    
    ArrayList<String> ll;
    ArrayList<String> NBitBinary(int n) {
       
       int ze= n/2;
       ll=new ArrayList<>();
       solve("",n,0,ze,0);
       return ll;
    }
    public void solve(String ans,int n,int z,int ze,int one){
        
        if(z>ze || one<z) return;
        if(ans.length()==n){
            ll.add(ans);
            return;
        }
        solve(ans+"1",n,z,ze,one+1);
        
        if(ans.length()>0 && ans.charAt(0)=='1')
            solve(ans+"0",n,z+1,ze,one);
    }
}
