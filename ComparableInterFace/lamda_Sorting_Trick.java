import java.util.*;

public class lamdaSortTrick {
    
    public static void test1(){
        
        Integer [] arr={2,4,5,65,6,8,9,0,7,13,14};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        ArrayList<Integer> ll=new ArrayList<>(Arrays.asList(arr)); // adding element of arr in list ll.
        Collections.sort(ll);
        System.out.println(ll);
    }
    // sort in decreasing order using lamda expression
     public static void test2(){
        
        Integer [] arr={2,4,5,65,6,8,9,0,7,13,14};

        Arrays.sort(arr,(a,b)->b-a);  // lamda use kiye hai
        // we can also write by this way both are same.
        Arrays.sort(arr,(a,b)->{
            return a-b;
        });
        System.out.println(Arrays.toString(arr));
    }
    // lamda expression on string. sort on basis of length.
    public static void test3(){
        
        String[] arr={"january","february","march","april","may","june","july","august","september","october","november","December"};

        Arrays.sort(arr,(a,b)->a.length()-b.length());  // lamda use kiye hai
        System.out.println(Arrays.toString(arr));

        ArrayList<String> ll=new ArrayList<>(Arrays.asList(arr));
        Collections.sort(ll,(a,b)->{
            return b.length()-a.length();     // lamda use kiye hai. we can also remove return see in Array.sort()
        });
        System.out.println(ll);
    }

    // creating pair class and sort using lamda expression.
    public static class pair{
        
        int v1=0,v2=0;
        pair(int v1,int v2){
            this.v1=v1;
            this.v2=v2;
        }
        // returning value (for more read on java t.point)
        public String toString(){
            return ""+this.v1+" "+""+this.v2;
        }
    }
    public static void test4(){

        ArrayList<pair> ll=new ArrayList<pair>();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=0;i<n;i++){

            int a=sc.nextInt();
            int b=sc.nextInt();
            ll.add(new pair(a, b));
        }

        Collections.sort(ll,(a,b)->a.v1-b.v2);
        Collections.sort(ll,(a,b)->{
            return a.v1-b.v1;
        });
        // 1st way to print value of pair calss
        for(int i=0;i<n;i++){

            pair p=ll.get(i);
            System.out.println(p.v1+" "+p.v2);
        }
        // 2nd way to print value of pair class using toString method.
        for(int i=0;i<n;i++){
            System.out.println(ll.get(i));
        }
    }
    // if data (v1) is equal than sort decreasing otherwise increasing.
    public static void test5(){

        ArrayList<pair> ll=new ArrayList<pair>();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=0;i<n;i++){

            int a=sc.nextInt();
            int b=sc.nextInt();
            ll.add(new pair(a, b));
        }
        Collections.sort(ll,(a,b)->{  // lamda sorting me apne khud ka logic likhkar sort karte hai apne according
            if(a.v1!=b.v1)
                return a.v1-b.v1;
            return b.v2-a.v2;
        });
        // 1st way to print value of pair calss
        for(int i=0;i<n;i++){

            pair p=ll.get(i);
            System.out.println(p.v1+" "+p.v2);
        }
    }
    public static void main(String[] args) {
        
        test5();    // this is known by java how integer is sort.
    }
}

/*--------------------------------------------------------------------------------------------------------------------------------------*/
// sorting 2d array suing lamda expression Method

import java.util.*;       

class Main {
    
    public static void printTwoDimensionArray(int [][] arr) {
        
        for (int i = 0; i < arr.length; i++) {
            
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            
            System.out.println("");
        }
    }

    public static void main(String [] args) {
        int [][] arr = {
                            {1, 2, 4},
                            {6, 8, 5},
                            {4, 7, 12},
                            {9, 11,-1},
                            {7, 10, 0},
                            {13, 16, 45},
                            {5, 9, 6},
                            {8, 9, 11},
                            {10, 11, 32},
                            {-1,100, 8}
                        };
                        
        Arrays.sort(arr, (a, b) -> Integer.compare(a[2], b[2]));         // a[0]-b[0] is also valid
        printTwoDimensionArray(arr);
    }
}

/*--------------------------------------------------------------------------------------------------------------------------------------*/
//  sort 2d array According to length

import java.util.*;         

class Main {
    
    public static void printTwoDimensionArray(int [][] arr) {
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static void main(String [] args) {
        int [][] arr = {
                            {1, 2, 4},
                            {6, 8, 5},
                            {4, 7, 12,12,45,67},
                            {9, 11,-1},
                            {7, 10},
                            {13, 16, 45, 12},
                            {5, 9, 6},
                            {8, 9, 11},
                            {10, 11, 32},
                            {-1}
                        };
                        
        Arrays.sort(arr, (a, b) -> Integer.compare(a.length, b.length)); // sort a/c to length.
        printTwoDimensionArray(arr);
    }
}
