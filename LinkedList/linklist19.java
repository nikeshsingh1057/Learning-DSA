
/*
 *  delete the last node of doubly linklist or last element from linklist
 */

public class linklist19 {

    Node head; /* to store first node address */

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
    public void AddingInBegning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        newNode.prev = null;
        if (head != null) {
            head.prev = newNode;
        }
        head = newNode;
    }

    /*
     * display in orignal linklist without deleting Last node.
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
     * function to delete Last node
     */
    public void deleteLasttNode() {

        Node curr=head;
        if (head == null || head.next == null)
            head = null;
        else
        {
            while(curr.next.next!=null) /* isme eak reference aage check karna hai. */
            curr=curr.next;

            curr.next.prev=null;
            curr.next=null;
        }
    }   


    /*
     * function to show after deleted Last node.
     */
    public void showAfterDeletedLastNode() {
        Node curr = head;
        while (curr != null) {
            System.out.printf(curr.data + "->");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        linklist19 list = new linklist19();
        list.AddingInBegning(23);
        list.AddingInBegning(45);
        list.AddingInBegning(95);
        list.AddingInBegning(35);

        list.showOriginal();
        list.deleteLasttNode();
        list.showAfterDeletedLastNode();
    }
}
