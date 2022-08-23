
/*
 *  Remove dublicate element from sorted Linklist.
 */
public class linklist29 {

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
     * function to remove dublicate element from sorted linklist.
     */
    public void RemoveDublicate() {
        if (head == null)
            return;

        Node curr = head;
        while (curr != null && curr.next != null) {

            /* method 1 */
            if (curr.data != curr.next.data)
                curr = curr.next;

            else {
                Node temp = curr;
                while (curr.next != null && temp.data == curr.next.data)
                    curr = curr.next;

                temp.next = curr.next;
            }

            /* anoter soulution */
            Node curr2 = head;

            while (curr != null && curr.next != null) {
                if (curr.data == curr.next.data)
                    curr.next = curr.next.next;

                else
                    curr = curr.next;
            }
        }
    }

    public void displayAfterRemove() // for displaying element.
    {
        Node curr = head;
        if (curr == null)
            System.out.println("linklist is empty");
        while (curr != null) {
            System.out.printf(curr.data + "->");
            curr = curr.next;
        }
    }

    public static void main(String[] args) {

        linklist29 LL = new linklist29();
        LL.addLastinLink(20);
        LL.addLastinLink(30);
        LL.addLastinLink(40);
        LL.addLastinLink(40);
        LL.addLastinLink(50);

        LL.RemoveDublicate();
        LL.displayAfterRemove();

    }
}
