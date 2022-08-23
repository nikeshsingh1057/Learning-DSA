/*
 * insert begning in Doubly linked list.
 */
public class linklist15 {

    Node head;  /* to store first node address */
    Node tail;  /* to store last node address */

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
    /*
     * adding element in the begning of doubly linklist.
     */
    public void AddInBegning(int data)
    {
        Node newNode= new Node(data);
        newNode.next=head;
        newNode.prev=null;
        if(head!=null)
        {
            head.prev=newNode;
        }
        head=newNode;/*head me new added element ka address dal diye hai. or simply return newNode bhee kar sakte hai agar function void na ho to .*/
    }
    /*
     * display in orignal order
     */
    public void showInSameOrder()
    {
        Node curr=head;
        while(curr!=null)
        {
            System.out.printf(curr.data + "->");
            tail=curr; /* tail me last node ka address dalane ke liye. */
            curr=curr.next;
        }
        System.out.println();
    }
    /*
     * display in opposite order i.e in reverse order using tail.
     */
    public void showInOppositeOrder()
    {
        Node curr=tail;
        while(curr!=null)
        {
            System.out.printf(curr.data + "->");
            curr=curr.prev;
        }
    }
    public static void main(String[] args) {
        linklist15 ll=new linklist15();

        ll.AddInBegning(23);
        ll.AddInBegning(45);
        ll.AddInBegning(95);
        ll.AddInBegning(35);
        ll.showInSameOrder();
        ll.showInOppositeOrder();

    }
}
