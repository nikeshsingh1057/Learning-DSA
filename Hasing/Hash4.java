import java.util.HashSet;

/*
 *  union of two unsorted arrays.
 */
public class Hash4
{
    public static void main(String[] args) {
        int A[] ={15,89,23,15};
        int B[] ={15,15,15,45};

        HashSet<Integer> s=new HashSet<>();

        for(int i=0;i<A.length;i++)
        s.add(A[i]);

        
        for(int i=0;i<B.length;i++)
        s.add(B[i]);

        System.out.println(s.size());
    }
}
