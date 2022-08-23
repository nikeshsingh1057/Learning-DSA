/* 
 *  implementation of Deque using linklist.
 *  we use doubly linklist to implement Deque.       
 */
class Node
{
    int data;
    Node next;
    Node prev;
    Node(int x)
    {
        data=x;
        next=null;
    }
}
public class DequeImp {
    
    Node front;
    Node rear;
    void InsertFront(int n)
    {
        Node newNode=new Node(n);
        if(front==null)
        {
            rear=front=newNode;
        }
        front.prev=newNode;      /* to link previous also */
        newNode.next=front;
        front=newNode;
    }
    void InserRear(int y)
    {
        Node newNode=new Node(y);
        if(rear==null)
        {
            front=rear=newNode;
        }
        newNode.prev=rear;
        rear.next=newNode;
        rear=newNode;

    }
    int DeleteFront()
    {
        if(front==null)
        {
            System.out.print("Deque is empty");
            return -1;
        }
        int ans=front.data;
        front=front.next;

        if(front==null) front=null;     /* jab Linklist me kewal eak node left ho tab ke liye condition */
        else   front.prev=null;  

        return ans;
    }
    int DeleteRear()
    {
        if(front==null)
        {
            System.out.print("Deque is empty");
            return-1;
        }   
        int ans=rear.data;
         rear= rear.prev;        /* move one node back */
                      
        if(rear==null) front=null;  /* jab Linklist me kewal eak node left ho tab ke liye condition */
        else rear.next=null;

        return ans;
    }
    public static void main(String[] args) {
        
        DequeImp D=new DequeImp();

        D.InsertFront(12);
        D.InsertFront(92);
        D.InsertFront(32);

        D.InserRear(45);
        D.InserRear(48);
        D.InserRear(55);

        D.DeleteFront();
        System.out.println(D.DeleteFront());
        System.out.println(D.DeleteFront());

        System.out.println(D.DeleteRear());
        
    }
}
