
/*
 *  delete the head of the circular linlist
 */
public class linklist24 {

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
     * adding element in the end of the circular linklist.
     */
    public void addEndOfCl(int data) {

        Node newNode = new Node(data);

        if (head == null) {
            newNode.next = newNode;
            head = newNode; /* or return simply if fn is not void newNode */
        } else {
            Node curr = head;

            while (curr.next != head)
                curr = curr.next; // this is neive solutiion

            curr.next = newNode;
            newNode.next = head; /* this is void fn so no need to return head */
        }

    }

    /*
     * travesing circurlar linklist ->note. there is no null in circular linklist
     */
    public void traverseCircuralLl() {

        if (head == null)
            return;

        System.out.print(head.data + " ");
        for (Node r = head.next; r != head; r = r.next) {
            System.out.print(r.data + " ");
        }
    }

    /*
     * function to delete first node.
     */
    public void DeleteFirstNode() {
        /* efficient solution */
        
        if (head == null || head.next == head) /* here we do head.next==head because linklist is circular */
            head = null;
        
           else
           {
                head.data=head.next.data;
          
                Node t2=head.next.next;
                head.next=t2;
           }
         

        /* neive solution */

        /*else {
            Node curr = head;
            while (curr.next != head)
                curr = curr.next;

            curr.next=head.next;
            head=head.next;   //head me agla wala element ka address dal diye hai 

        }*/

    }

    public static void main(String[] args) {

        linklist24 list = new linklist24();

        list.addEndOfCl(677);
        list.addEndOfCl(478);
        list.addEndOfCl(804);
        list.addEndOfCl(764);

        list.DeleteFirstNode();

        list.traverseCircuralLl();
    }
}
