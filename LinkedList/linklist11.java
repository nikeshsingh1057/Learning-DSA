                   /*Searching element in linked the list */
                   
public class linklist11 {
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
    public void AddElenentInLl(int data)
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
     *  Search in the linklist. (like linear search in Array.)
     */
    
    public int SearchInLl(int key)
    {
        int count=0;
        Node curr=head;
        while(curr!=null)
        {
            count++;

            if(curr.data==key)
             return count;

            curr=curr.next;
        }
       return -1;
    }
    public static void main(String[] args) {

        linklist11 list=new linklist11();

        list.AddElenentInLl(4);
        list.AddElenentInLl(7);
        list.AddElenentInLl(18); 
        list.AddElenentInLl(188); 
        list.AddElenentInLl(100);

       System.out.println( list.SearchInLl(7)); //searching element in list.
    }
}
