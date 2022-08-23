/* deleting first node of singly linklist */

public class linklist9 {
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
     * function to delete last node of linkedlist
     */
    public Node LastnodeDelete()
    {
        Node curr=head;
        if(curr==null)
        return head;

        if(curr.next==null)
        return null;

            while(curr.next.next!=null)
            {
                curr=curr.next;
            }
         curr.next=null;
         return head;
    
    }
    public static void main(String[] args) {

        linklist9 list=new linklist9();

        list.addFirst(4);
        list.addFirst(7);
        list.addFirst(18); 
        list.addFirst(188); 
        list.display();//agar hum display me head pass nahi karenge to bhee run hoga because void fn hai
        Node head=list.LastnodeDelete();
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

