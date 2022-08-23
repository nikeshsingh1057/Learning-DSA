
/*  
*  method to add element in the end/last of linklist 
*/

public class linklist7 {
    
    class Node {
        int data;
        Node next;

        Node(int x) {
            this.data = x;
            this.next = null;
        }
    }

    public Node head; //head me hamesha first ka address rahkana hoga nahi to access nahi kar payenge.

    public void addLast(int data) // adding element in last position in linklist.
    {

        Node lastadd = new Node(data); // creating each time node
        
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

    public void display() // for displaying element of linklist
    {
        Node curr = head;
        if (curr == null)
            System.out.println("linklist is empty");
        while (curr != null) {
            System.out.printf(curr.data + " ->");
            curr = curr.next;
        }
    }

    public static void main(String[] args) {

        linklist7 LL = new linklist7();

        LL.addLast(4);
        LL.addLast(7);
        LL.addLast(18); // agar hum display me head pass nahi karenge to bhee run hoga because head
                        // public hai
        LL.addLast(90);
        LL.addLast(900);

        LL.display();
    }

}
