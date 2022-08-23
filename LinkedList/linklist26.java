
/*  
*  Sorted insert in a linked list or add new element in sorted linklist.
*/

public class linklist26 {

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
 *  adding element in the linklist
 */
    public void addLastinLl(int data) {
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
     * function to dispaly new linklist.
     */
    public void display() {
        Node curr = head;
        if (curr == null)
            System.out.println("linklist is empty");
        while (curr != null) {
            System.out.printf(curr.data + " ->");
            curr = curr.next;
        }
    }

    /*
     * function to add new element in sorted linklist.
     */
    public void SortedAddElement(int element) {
        Node temp = new Node(element);

        if (head == null)
            head = temp;
        else if (element <= head.data) {
            temp.next = head;
            head = temp;
        } else {
            Node curr = head;
            while (curr != null) {
                if (curr.next == null || curr.data < element && curr.next.data >= element) {
                    temp.next = curr.next;
                    curr.next = temp;
                    break;
                }
                curr = curr.next;
            }
        }

    }

    public static void main(String[] args) {

        linklist26 LL = new linklist26();

        LL.addLastinLl(10);
        LL.addLastinLl(20);
        LL.addLastinLl(30);
        LL.addLastinLl(40);

        LL.SortedAddElement(35);
        LL.display();
    }

}
