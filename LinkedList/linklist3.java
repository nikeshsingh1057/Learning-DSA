       /*linklist implemention method third geeks for geeks sandeep sir.*/
class node
{
    int data;
    node next;
    node(int x)
    {
        this.data=x;
        this.next=null;
    }
}

public class linklist3 {
    public static void main(String[] args) {
         node first=new node(10);       //creating first node
         node head=first;

        //first.next=new node(20);

         node second=new node(20);     //creating second node
         first.next=second;

        //first.next.next=new node(20);

         node third =new node(30);     //creatind third node
         second.next=third;

        //first.next.next.next=new node(40);

        printlist(head);   //head ka address pass kiy hai.
    }
    static void printlist(node head)
    {
        node n=head;

        while(n!=null)
        {
            System.out.println(n.data);
            n=n.next;
        }
        //using recuesion
       /* if(head==null) return;
        System.out.println(head.data);
        head=head.next;
        printlist(head.next); */

    }
}
