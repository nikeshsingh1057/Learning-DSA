
/*
 *  adding element in the end of the circular linklist
 */
public class linklist23 {

    public Node head;

    class Node {
        int data;
        Node next;

        Node(int x) {
            this.data = x;
            this.next = null;
        }
    }

    /*
     * adding element in the end of the circular linklist.
     */
    public void addEndOfCl(int data) {

        Node newNode = new Node(data);

        if(head==null)
        {
            newNode.next=newNode;
            head=newNode; /* or return newNode */
        }
       /*  else
        {
            Node curr=head;
            while(curr.next!=head)
            curr=curr.next;             //this is neive solutiion 

            curr.next=newNode;
            newNode.next=head;
        }*/
        else
        {
            newNode.next=head.next;
            head.next=newNode;
                                       /* this is efficient solution */
            int t=newNode.data;
            newNode.data=head.data;
            head.data=t;

            head=newNode; /* or simply return newNode if fn is not void */
        }

        
    }

    /*
     * travesing circurlar linklist ->note. there is no null in circular linklist
     */
    public void traverseCircuralLl() {
        
        if (head == null)
            return;

        System.out.print(head.data + " ");
        for (Node r = head.next; r != head; r = r.next) {
            System.out.print(r.data + " ");
        }
    }

    public static void main(String[] args) {

        linklist24 list = new linklist24();

        list.addEndOfCl( 477);
        list.addEndOfCl(470);
        list.addEndOfCl(854);
        list.addEndOfCl(74);

        list.traverseCircuralLl();
    }
}

