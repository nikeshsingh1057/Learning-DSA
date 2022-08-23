
/*
 * doubly linkedList in java
 */

class Node {
    int data;
    Node prev;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
             
public class linklist14 {

       static Node start; /* temporary variable is taken  to print it from begning */
       static Node last;  /* temporary variable is taken to print it from last */
    public static void main(String[] args) {
        Node head=new Node(10);        
        Node temp1=new Node(20);        
        Node temp2=new Node(30);

        start=head;
        last=temp2;

        head.next=temp1;
        temp1.prev=head;
        temp1.next=temp2;
        temp2.prev=temp1;

        /* to display it from begning */    
        while(start!=null)
        {
            System.out.printf(start.data + "->");
            start=start.next;
        }
        System.out.println();
        /* to display it from last */    
        while(last!=null)
        {
            System.out.printf(last.data + "->");
            last=last.prev;
        } 
    }
}
