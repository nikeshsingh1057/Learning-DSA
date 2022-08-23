
                 /* Reverse of linklist using while loop */

public class linklist12 {
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
    public void AddElenentInList(int data)
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
     * function to display original linklist.
     */
    public void originalLl()
    {
        Node curr=head;
        while(curr!=null)
        {
            System.out.printf(curr.data + "->");
            curr=curr.next;
        }
        System.out.println();
    }
    /*
     *  function to reaverse the linklist using while loop.
     */
    static Node previous;  //creating a static node

    public void ReverseLinklist()
    {
        Node curr=head;
        previous=null;     //hum null se na chala kar head se chala sakte hai and curr ko uske agle se.
        while(curr!=null)
        {
            Node temp=curr.next;
            curr.next=previous;
            previous=curr;   //aage na store karke piche se link kar diye hai.
            curr=temp; //link break na ilsy aage wala ka reference temp me store kara liye hai.
        }

       /* previous=head; 
        Node curr=head.next;     //ye bhee work karega.
        while(curr!=null)
        {
            Node temp=curr.next;
            curr.next=previous;
            previous=curr;   
            curr=temp;   
        }
       
            head.next=null;
            head=previous; */    
    
    }
    /* function to display reverse of linklist  */
    public void ShowReverseLl()
    {
        //Node curr=head;     //jo comment wala code uske liye hai wo work karega.

        Node curr=previous;
        while(curr!=null)
        {
            System.out.printf(curr.data + "->");
            curr=curr.next;
        }
    }
    
   
    
    public static void main(String[] args) {

        linklist12 list=new linklist12();

        list.AddElenentInList(4);
        list.AddElenentInList(7);
        list.AddElenentInList(18); 
        list.AddElenentInList(188); 
        list.AddElenentInList(100);

        list.originalLl(); //display original linklist.
        list.ReverseLinklist();   //calling function to reverse linklist.
        list.ShowReverseLl(); //calling function to display reverse linklist.

    }
}

