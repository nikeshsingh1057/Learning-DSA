
/*
 *  delete the kth node of the circurlar linklist.
 */
public class linklist25 {

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
    public void addEndOfCircularLl(int data) {

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
        System.out.println();
    }

    /*
     * function to delete first node.
     */
    public Node DeleteFirstNode() {
        /* efficient solution */

        if (head == null || head.next == head)
            return head = null;
        else {
            head.data = head.next.data;

            Node t2 = head.next.next;
            head.next = t2;
            return head;
        }
    }

    /*
     * function to delete kth Node of linklist.
     */
    public Node DeleteKthNode(int kth) {
        if (head == null)
            return head;
        if (kth == 1)
            return DeleteFirstNode();

        Node curr = head;
        for (int i = 0; i < kth - 2; i++)
            curr = curr.next;

        curr.next = curr.next.next;
        return head;
    }

    public static void main(String[] args) {

        linklist25 list = new linklist25();

        list.addEndOfCircularLl(677);
        list.addEndOfCircularLl(478);
        list.addEndOfCircularLl(804);
        list.addEndOfCircularLl(764);

        list.traverseCircuralLl();

        Node trav = list.DeleteKthNode(4); /* pass the kth element you want to delete */

        if (trav == null)
            return;

        System.out.print(trav.data + " ");
        for (Node r = trav.next; r != trav; r = r.next) {
            System.out.print(r.data + " ");
        }

    }
}
