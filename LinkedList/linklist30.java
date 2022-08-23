/*
 *  segregate even and odd linklist. i.e arrange all even together and all odd together.
 */
public class linklist30 {

    class Node {
        int data;
        Node next;

        Node(int x) {
            this.data = x;
            this.next = null;
        }
    }

    public Node head;

    public void AddingLast(int data) // adding element in last position in linklist.
    {
        Node lastadd = new Node(data);
        Node curr = head;

        if (curr == null) {
            head = lastadd;
        } else {
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = lastadd;
        }
    }

    /*
     * function to segregate even and odd.
     */
    public void segregate() {
        if (head == null)
            return;
        Node dummyodd = new Node(-1);
        Node dummyeven = new Node(-1);
        Node oddtail = dummyodd;
        Node eventail = dummyeven;
        Node curr=head;
        while (curr != null) {
            if (curr.data % 2 != 0) {

                oddtail.next=curr;
                oddtail=oddtail.next;
            }
            else
            {
                eventail.next=curr;
                eventail=eventail.next;
            }
            curr=curr.next;
        }
        eventail.next=dummyodd.next;
        oddtail.next=null;
        Node ev=dummyeven.next;
       while(ev!=null)
       {
        System.out.printf(ev.data+ " "); ev=ev.next;
       }
       System.out.println();
    }

    public void display() // for displaying element of linklist
    {
        Node curr1 = head;
        if (curr1 == null)
            System.out.println("linklist is empty");
        while (curr1 != null) {
            System.out.printf(curr1.data + " ->");
            curr1 = curr1.next;
        }
    }

    public static void main(String[] args) {

        linklist30 LL = new linklist30();

        LL.AddingLast(41);
        LL.AddingLast(17);
        LL.AddingLast(18);
        LL.AddingLast(9);
        LL.AddingLast(90);

        LL.segregate();

        LL.display();
    }

}
