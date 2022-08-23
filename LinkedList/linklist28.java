
/*
 *  find Nth from the end of the linklist.
 */
public class linklist28 {

    class Node {
        int data;
        Node next;

        Node(int x) {
            this.data = x;
            this.next = null;
        }
    }

    public Node head;

    /*
     * adding element in the linklist
     */
    public void addLastinLink(int data) {

        Node lastadd = new Node(data);
        Node curr = head;

        if (curr == null) {
            head = lastadd;

        }

        else {
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = lastadd;
        }

    }

    /*
     * function to printing kth element from the end in linklist.
     */
    public void NthElementFromEnd(int pos) {

        /* nieve solution */
        int lenth = 0;
        for (Node curr = head; curr != null; curr = curr.next)
            lenth++;

        if (lenth < pos)
            return;

        Node curr = head;
        for (int i = 1; i < lenth - pos + 1; i++)
            curr = curr.next;
        System.out.println(curr.data);

        /* efficient solution using two pointer approch*/
        if (head == null)
            return;

        Node first = head;
        for (int i = 0; i < pos; i++) 
        {
            if (first == null)
                return;
            first = first.next;
        }
            Node second = head;

            while (first != null) {
                second = second.next;
                first = first.next;
            }
            System.out.println(second.data);
    }

    public static void main(String[] args) {

        linklist28 LL = new linklist28();
        LL.addLastinLink(56);
        LL.addLastinLink(78);
        LL.addLastinLink(56);
        LL.addLastinLink(30);
        LL.addLastinLink(40);

        LL.NthElementFromEnd(1);
    }
}
