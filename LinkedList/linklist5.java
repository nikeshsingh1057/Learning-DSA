/*second method to add element in the begning in the list  */
//isme sab kuch public banaye hai kuch bhee static nahi hai.
class node
{
    int data;
    node next;
    node(int x)
    {
        data=x;
        next=null;
    }
}

public class linklist5 {

     node head;   // public head craet kiye hai

      void insert(int x)  //value dalene wala function jo main class se aa raha hai
    {
      node newNode=new node(x);
        if(head!=null)
        {
            newNode.next=head;
        }
       head=newNode;
    }
     void display(node head)  //display karane ke liye.
    {
        while(head!=null){
        System.out.println(head.data);
        head=head.next;}

    }
    public static void main(String[] args){
       linklist5 ll=new linklist5(); // main class ka object banaye hai on the basis of oop concept.

        ll.insert(10);
        ll.insert(20);
        ll.insert(30);

        ll.display(ll.head);
        
        
    }
}
