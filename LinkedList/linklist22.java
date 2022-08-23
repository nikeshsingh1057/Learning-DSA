/*
 *  Method 3rd to adding element in the begning of the circular linklist and traverse it.
 */
public class linklist22 {

    public Node head;

    class Node {
        int data;
        Node next;

        Node(int x) {
            this.data = x;
            this.next = null;
        }
    }

    /*
     * adding element in the begning of the circular linklist.
     */
    public Node addBegningin(Node head, int data) {

        Node newNode = new Node(data);
        if (head == null) 
        {
            newNode.next = newNode;
            return newNode;
        }
        else 
        {
           newNode.next=head.next;
           head.next=newNode;

           int t=head.data;  /* value ka swaping kar rahe hai */
           head.data=newNode.data;
           newNode.data=t;

           return head; /* isme head ilsy rerurn karaye hai because head to same hai sirf value swap kiye hai. */
        }
    }

    /*
     * travesing circurlar linklist ->note. there is no null in circular linklist
     */
    public void traverseCircuralLl(Node newNode) {

        Node head = newNode; /* newNode node ka jo address mila thaa usko head me assign kar diye. */

        if (head == null)
            return;

        System.out.print(head.data + " ");
        for (Node r = head.next; r != head; r = r.next) {
            System.out.print(r.data + " ");
        }
    }

    public static void main(String[] args) {

        linklist22 list = new linklist22();

        Node hea = list.addBegningin(list.head, 477);
        Node head1 = list.addBegningin(hea, 470);
        Node head2 = list.addBegningin(head1, 854);
        Node head3 = list.addBegningin(head2, 574);

        list.traverseCircuralLl(head3);
    }
}
