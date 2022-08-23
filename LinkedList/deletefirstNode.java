/* deleting first node of singly linklist */

public class linkedlist8 {
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
    public Node head=null; 

    /*
     * fisrt of all adding element in the linklist from beging
     */
    public void addFirst(int data) 
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    /*
     * displaying original linklist .
     */
    public void display() 
    {
        Node curr=head;
        if(curr==null) System.out.println("linklist is empty");
        while(curr!=null)
        {
            System.out.printf(curr.data + "-> ");
            curr=curr.next;
        }
        System.out.println();
    }
    /*
     * function to delete first node of linkedlist
     */
    public Node FirstnodeDelete()
    {
        if(head==null)
        return head;

        else 
        return head.next;
    }
    public static void main(String[] args) {

        linkedlist8 list=new linkedlist8();
        
        list.addFirst(4);
        list.addFirst(7);
        list.addFirst(18); 
        list.addFirst(188); 
        list.display();//agar hum display me head pass nahi karenge to bhee run hoga because void fn hai
        Node head=list.FirstnodeDelete();
        /*
         * dispalying after deleting first node of linklist
         */
        while(head!=null)
        {
            System.out.printf(head.data + " -> ");
            head=head.next;
        }
        
    }
    
}
