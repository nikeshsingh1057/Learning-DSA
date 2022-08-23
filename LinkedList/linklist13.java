
/*reverse linklist using recursion */

public class linklist13 {

    class Node {
        int data;
        Node next;

        Node(int x) {
            this.data = x;
            this.next = null;
        }
    }

    public Node head = null;

    /*
     * adding elemtnt in linklist.
     */
    public void InsertingElement(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    /*
     * function to display original linklist.
     */
    public void originalLl() {
        Node curr = head;
        while (curr != null) {
            System.out.printf(curr.data + "->");
            curr = curr.next;
        }
        System.out.println();
    }
    /*
     * function to reaverse the linklist
     *  to understand better dry run or see on youtube.
     */

    public Node ReverseLinklist(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node newNode = ReverseLinklist(head.next);
        Node headnext = head.next;
        headnext.next=head;
        head.next = null;

        // head.next.next=head;   /*this line is also working to reverse linklist. */
        // head.next=null;

        return newNode;

    }

    /* function to display reverse of linklist */
    public void ShowReverseLl(Node previous)
    {
        Node curr=previous;
        while(curr!=null)
        {
            System.out.printf(curr.data + "->");
            curr=curr.next;
        }
    }

    public static void main(String[] args) {

        linklist13 list = new linklist13();

        list.InsertingElement(4);
        list.InsertingElement(7);
        list.InsertingElement(18);
        list.InsertingElement(188);
        list.InsertingElement(100);

        list.originalLl(); // display original linklist.

        Node previous = list.ReverseLinklist(list.head);

        list.ShowReverseLl(previous);

    }

}
