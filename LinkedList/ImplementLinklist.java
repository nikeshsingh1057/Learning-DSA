
/* implemantation of linklist in java method 1 */

public class linkLIst1 {

   // Node head;  //first node ka address store kiya hai .

    class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            next=null;
        }
    }

    void Print(Node head) //this is also valid.
    {
        Node n=head;
        while(n!=null)
        {
            System.out.println(n.data);   // n.data isly kiye kuki next other class me hai usko . operator se acces kiye hai

            n = n.next;  //n.next karne se n me second ka address chala because niche hum first wale me first.next =second kar diye hai jisase agar n.next karne par usem second bolock or second heap ka addredd chala jayega
        }
    }

    public static void main(String[] args) {
        linkLIst1 ll=new linkLIst1();
      
        Node first =ll.new Node(10);
        //ll.head=first;  
        Node head=first;  // yaha bhee Node address le sakte hai and usko pass kar sakte hai.

        Node second =ll.new Node(20);
        first.next=second;  //first me second ka address dal diye or reference

        Node third =ll.new Node(30);
        second.next=third;  // second me third ka address dal diye or reference
      
        ll.Print(head);

    }
    
}
