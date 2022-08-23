/* 
 *    Insert element at the end of the Doubly linklist. 
 */
public class linklist16 {

    Node head; /* to store first node address */
    Node tail; /* to store last node address */

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
     * function to Insert at the end of the linklist.
     */
    public void InsertAtEnd(int data) {
        Node lastAdded = new Node(data);
        Node curr = head;

        if (head == null)
            head = tail = lastAdded;

        else {
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = lastAdded;
            lastAdded.prev = curr;

            tail=lastAdded; /* tail me last wala element ka address store kara diye hai */
        }
    }

    /*
     * display in orignal order
     */
    public void ShowInSameOrder() {
        Node curr = head;
        while (curr != null) {
            System.out.printf(curr.data + "->");
            curr = curr.next;
        }
        System.out.println();
    }
     /*
     * display in opposite order i.e in reverse order using tail.
     */
    public void showInOppositeOrder()
    {
        Node curr=tail;
        while(curr!=null)
        {
            System.out.printf(curr.data + "->");
            curr=curr.prev;
        }
    }

    public static void main(String[] args) {

        linklist16 list = new linklist16();
        list.InsertAtEnd(23);
        list.InsertAtEnd(93);
        list.InsertAtEnd(39);
        list.InsertAtEnd(73);

        list.ShowInSameOrder();
        list.showInOppositeOrder();
    }
}
