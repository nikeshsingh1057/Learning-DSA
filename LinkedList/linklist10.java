      /* insert node at given position */

public class linklist10 {
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
   * adding elemtnt in linklist.
   */
    public void AddElenentInLL(int data)
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
     * inserting new node in linklist at given position
     */
    public Node insertNode(int pos,int element)
    {
        Node temp=new Node(element);
        if(pos==1)
        {
            temp.next=head;
            return head=temp; 
           // return temp;    this will also work since temp become first .
        }
        Node curr=head;
        for(int i=1;i<pos-1 && curr!=null;i++)
        {
            curr=curr.next;
        }
        if(curr==null) return head;  //if pos is out side bond;

        temp.next=curr.next;
        curr.next=temp; //if we not do this to add our new node with previous.
        return head;
    }
    /*
     * for displaying new linklist after adding new element in linklist
     */
    public void display()
    {
        Node curr=head;
        if(curr==null) System.out.println("linklist is empty");
        while(curr!=null)
        {
            System.out.printf(curr.data + "->");
            curr=curr.next;
        }
    }
    public static void main(String[] args) {

        linklist10 list=new linklist10();

        list.AddElenentInLL(4);
        list.AddElenentInLL(7);
        list.AddElenentInLL(18); 
        list.AddElenentInLL(188); 
        list.AddElenentInLL(100); 

        list.insertNode(4,500); //method for inserting node.

        list.display();//agar hum display me head pass nahi karenge to bhee run hoga because function void hai.
    }

}
/*
 * agar method static rahata hai to class ka object banae ka jarurt nahi hota hai yani direct 
 * call kar sakte hai.
 * agar method public rahata hai to call karane ke liye object ka class banana padata hai.
 */
