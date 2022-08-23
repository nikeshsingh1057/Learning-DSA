/*
 *  Method 1st to adding element in the begning of the circular linklist and traverse it.
 */
public class linklist20 {

    public Node head;
    public Node tail;

    class Node
    {
        int data;
        Node next;
        Node(int x)
        {
            this.data=x;
            this.next=null;
        }
    } 
    /*
     *  adding element in the begning of the circular linklist.
     */
    public void addBegningin(int data) 
    {
        Node newNode=new Node(data);
        if(head==null)
        {
           tail= head=newNode; /* yaha par hum tail eak extra liye hai agar tail nahi hota to while loop se last node pata karte. */
            head.next=head;
            return;
        }
        newNode.next=head;
        tail.next=newNode;
        head=newNode;   /* returning address of new inserting node. */
    }
    /*
     *  travesing circurlar linklist ->note. there is no null in circular linklist
     */
    public void traverseCircuralLl()
    {
        if(head==null) return;

        System.out.print(head.data+" ");
        for(Node r=head.next;r!=head;r=r.next)
        {
            System.out.print(r.data + " ");
        }
    }
    public static void main(String[] args) {
        linklist20 list=new linklist20();
        list.addBegningin(4);
        list.addBegningin(7);
        list.addBegningin(18); 
        list.addBegningin(188);
    
        list.traverseCircuralLl();
    } 
}
