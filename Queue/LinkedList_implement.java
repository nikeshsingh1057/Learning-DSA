/*
 *  implementation of queueu using Linklist.
 */
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        next = null;
    }
}

class LinklistImplem {

    Node front;  /* to store first node address */
    Node rear;   /* to maintain node */
    public void Enqueu(int x) {

        Node link = new Node(x);
        if (front == null) {
            rear=front = link;
            return;
        }
        rear=rear.next=link;
       // rear=link;
    
    }

    public int Dequeu() {

        if (front == null) {
            System.out.print("queue is empty");
            return -1;
        }
        int result = front.data;
        front = front.next;
        return result;
    }
    public int getFirst()
    {
        if(front==null)
        return -1;   /* -1 if queue is empty */
        else
        return front.data;
    }
    public int getLast()
    {
        if(rear==null)
        return -1;   /* -1 if Queue is empty */
        else
        return rear.data;
    }
    public static void main(String[] args) {
        
        LinklistImplem s=new LinklistImplem();

        s.Enqueu(10);
        s.Enqueu(56);
        s.Enqueu(89);
        s.Enqueu(9);

         System.out.println(s.Dequeu());
         System.out.println(s.Dequeu());
         System.out.println(s.getLast());
         System.out.println(s.getFirst());

    }
}
