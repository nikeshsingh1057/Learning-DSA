import java.util.ArrayList;
import java.util.Arrays;

class ArrayList_Of_Int_Array{
    public static void main(String[] args) {
        
        ArrayList<int[]> ll=new ArrayList<>();
        // arrayList ke andar array ko put karna.

        ll.add(new int[3]);
        ll.add(new int[10]);
        ll.add(new int[6]);
        ll.add(new int[15]);
        
        System.out.println(ll); // [[I@2c7b84de, [I@3fee733d, [I@5acf9800, [I@4617c264]  // Arraylist me array ka address.
        System.out.println(ll.size()); // 4

        System.out.println(ll.get(0).length); // 0 wale index par array ka lenght. 3
        System.out.println(ll.get(3).length); // 3 wale index par array ka lenght. 15

        // adding element in array of specific index of arraylist.
        ll.get(0)[0]=13;     // aisa likhane se hum array ka address access kar paa rahe hai isly isme element add kar paa rahe hai.
        ll.get(0)[1]=15;
        ll.get(0)[2]=16;

        ll.get(2)[0]=10;
        ll.get(2)[2]=90;
        ll.get(2)[5]=100;
       
        System.out.println(Arrays.toString(ll.get(0)));
        System.out.println(Arrays.toString(ll.get(2)));

        // we can do same for other which is present in list.
    }
}
