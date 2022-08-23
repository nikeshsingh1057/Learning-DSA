
/*
 *  delete the first node of doubly linklist or head of doubly linklist.
 */

public class linklist18 {

    Node head;      /* to store first node address */

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
    public void AddInBegning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        newNode.prev = null;
        if (head != null) {
            head.prev = newNode;
        }
        head = newNode;/*
                        * head me new added element ka address dal diye hai. or simply return newNode
                        * bhee kar sakte hai agar function void na ho to .
                        */
    }

    /*
     * display in orignal linklist without deleting first node.
     */
    public void showOriginal() {
        Node curr = head;
        while (curr != null) {
            System.out.printf(curr.data + "->");
            curr = curr.next;
        }
        System.out.println();
    }

    /*
     * function to delete first node
     */
    public void deletefirstNode() {

        if (head == null || head.next == null)
            head = null;
        else
        {
            head=head.next;
            head.prev=null;
        }
    }

    /*
     * function to show after deleted first node.
     */
    public void showAfterDeletedFirstNode() {
        Node curr = head;
        while (curr != null) {
            System.out.printf(curr.data + "->");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        linklist19 ll = new linklist19();
        ll.AddingInBegning(23);
        ll.AddingInBegning(45);
        ll.AddingInBegning(95);
        ll.AddingInBegning(35);

        ll.showOriginal();
        ll.deleteLasttNode();
        ll.showAfterDeletedLastNode();
    }
}
