import java.util.*;
class pair{

    int x, y;
    pair(int x,int y){
        this.x=x;
        this.y=y;
    }
    public String toString(){
        return "("+x+","+y+")";
    }
}
// creating Comparator interface class 
class myCmp2 implements Comparator<pair>{

    public int compare(pair p1, pair p2){
        return p1.x-p2.x;
    }
}
public class Comparator1 {
    public static void main(String[] args) {

        pair[] arr={new pair(10, 34),new pair(67, 54),new pair(12, 6),new pair(3, 40)};

        Arrays.sort(arr,new myCmp2());
        // using lamda new feather we does not need to create myCmp2 class comparator.
        Arrays.sort(arr,(p1,p2)->p1.x-p2.y);   // we not need to create myCmp2 class with lamda sort techinique.

        System.out.println(Arrays.toString(arr));
    }
}
