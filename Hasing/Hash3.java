import java.util.HashSet;

/*
 *  intersection of two arrays (leetcode 349)
 */

public class Hash3 {
    public static void main(String[] args) {
        int A[] ={10,15,20,15,30,30,5};
        int B[]={30,5,30,80};

        int count=intersection(A,B);
        System.out.println(count);
    }
    static int intersection(int[] A ,int B[])
    {
        HashSet<Integer> s=new HashSet<>();
        
        for(int i=0;i<A.length;i++)
        s.add(A[i]);

        int res=0;
        for(int i=0;i<B.length;i++)
        {
            if(s.contains(B[i]))
            {
                res++;
                s.remove(B[i]);
            }
        }

        return res;
    }
}
