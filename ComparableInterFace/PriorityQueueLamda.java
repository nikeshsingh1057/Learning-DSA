import java.util.PriorityQueue;
import java.util.Scanner;

public class PriorityQueueLamda {

    public static class pair{
        
        int v1=0,v2=0;
        pair(int v1,int v2){
            this.v1=v1;
            this.v2=v2;
        }
    }
    public static void test1(){

        PriorityQueue<pair> pq=new PriorityQueue<>((a,b)->{
            return a.v1-b.v1;
        });

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=0;i<n;i++){

            int a=sc.nextInt();
            int b=sc.nextInt();
            pq.add(new pair(a, b));
        }
        while(pq.size()!=0){
            pair p=pq.remove();
            System.out.println(p.v1+" "+p.v2);
        }
    }
    // priority queue of uaing int [] pair.
    public static void test2(){

        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->{
            return a[0]-b[0];
        });

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=0;i<n;i++){

            int a=sc.nextInt();
            int b=sc.nextInt();
            pq.add(new int[]{a,b});
        }
        while(pq.size()!=0){
            int[] p=pq.remove();
            System.out.println(p[0]+" "+p[1]);
        }
    }
    public static void main(String[] args) {

        test1();
        test2();
    }
}
