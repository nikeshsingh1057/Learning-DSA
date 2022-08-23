
/*
 *  find the middle element of linklist.
 */
public class linklist27 {

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
     * function to printing mid element of linklist.
     */
    public void Midelement() {
        /* nieve solution */
        if (head == null)
            return;

        int count = 0;
        Node curr;
        for (curr = head; curr != null; curr = curr.next) /* first count the total node */
            count++;

        curr = head;
        for (int i = 0; i < count / 2; i++) /* run the loop count by 2 */
            curr = curr.next;
        System.out.println(curr.data);

        /* efficient colution */
        if (head == null)
            return;

        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println(slow.data);
    }

    public static void main(String[] args) {

        linklist27 LL = new linklist27();
        LL.addLastinLink(56);
        LL.addLastinLink(78);
        LL.addLastinLink(56);
        LL.addLastinLink(30);
        LL.addLastinLink(40);

        LL.Midelement();
    }
}
