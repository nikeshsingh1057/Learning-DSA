/*
 *  reverse doubly linkedlist in java
 */
public class linklist17 {
    
    Node head; /* to store first node address */
    Node tail; /* to store last node address */

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
     * function to reverse doubly linklist
     */
    public Node  reverseDoublyll(Node head)
    {
        Node curr=head;
        Node temp=null;
        if(head==null || head.next==null) return head;
        while(curr!=null)
        {
            temp= curr.prev; 
            curr.prev=curr.next;
            curr.next=temp;
            curr=curr.prev;
        }
        return temp.prev; /* we return temp.prev because if we return temp it will null so we retrun temp.prev */
       //return head=temp.prev    /* both are working */
    }
    /*
     * display in reverse order
     */
    public void showInReverseOrder(Node head)
    {
        Node curr=head;
        while(curr!=null)
        {
            System.out.printf(curr.data + "->");
            // tail=curr; /* tail me last node ka address dalane ke liye. */
            curr=curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

            linklist17 ll=new linklist17();
    
            ll.AddInBegning(23);
            ll.AddInBegning(45);
            ll.AddInBegning(95);
            ll.AddInBegning(35);

            ll.showInSameOrder();
          Node temp = ll.reverseDoublyll(ll.head); /* ll.head since head is public and outside main fun. */
            ll.showInReverseOrder(temp);
    
        }
    
}
