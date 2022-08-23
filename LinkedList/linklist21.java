/*
 *  Method 2nd to adding element in the begning of the circular linklist and traverse it.
 */
public class linklist21 {

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
            newNode.next = newNode;
        else
        {
            Node curr=head;
            while(curr.next!=head)
            curr=curr.next;

            curr.next=newNode;
            newNode.next=head;
        }
        return newNode; /* har barr ye new element ka reference return kar dega niche node me.*/
    }

    /*
     * travesing circurlar linklist ->note. there is no null in circular linklist
     */
    public void traverseCircuralLl(Node newNode) {

        Node head=newNode;    /* newNode node ka jo address mila thaa usko head me assign kar diye. */

        if (head == null)
            return;

        System.out.print(head.data + " ");
        for (Node r = head.next; r != head; r = r.next) {
            System.out.print(r.data + " ");
        }
    }

    public static void main(String[] args) {

        linklist21 list = new linklist21();

        Node hea=list.addBegningin(list.head,4);
        Node head1=list.addBegningin(hea,40);
        Node head2=list.addBegningin(head1,84);
        Node head3=list.addBegningin(head2,54);

        list.traverseCircuralLl(head3);
    }
}
