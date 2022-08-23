/* third method to add elemetn in the begning of linklist */

public class linklist6 {
    class node
    {
        int data;
        node next;
        node(int x)
        {
            this.data=x;
            this.next=null;
        }
    }
    public node head=null; 

    public void addFirst(int data) //adding element at fisrst positon in linklist.
    {
        node newNode=new node(data);
        if(head==null)
        {
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    public void display() //for displaying element.
    {
        node curr=head;
        if(curr==null) System.out.println("linklist is empty");
        while(curr!=null)
        {
            System.out.printf(curr.data + "->");
            curr=curr.next;
        }
    }
    public static void main(String[] args) {

        linklist6 list=new linklist6();

        list.addFirst(4);
        list.addFirst(7);
        list.addFirst(18); 
        list.addFirst(188);
        list.display();//agar hum display me head pass nahi karenge to bhee run hoga because head public hai
    }

}
