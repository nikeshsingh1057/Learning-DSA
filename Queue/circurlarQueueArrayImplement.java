/*
 *  Implementation of Queue using Circular Array method
 */
class Queue
{
    int [] arr;
    int front;
    int size;
    int rear;
    Queue(int c)
    {
        arr=new int[c];
        front=-1;
        rear=-1;
        size=c; 
    }
    boolean isEmpty()
    {
      return rear==-1 && front==-1;
    }
    boolean ifFull()
    {
        return ((rear+1)%size==front);
    }
    void Enqueu(int data) /* adding element in queue */
    {
        if(ifFull())
        {
            System.out.println("queue is full");
            return;
        }
        if(front==-1) front+=1;  /* queue contain one element */

        rear=(rear+1)%size;
        arr[rear]=data;
    }
    int  Dequeu()
    {
        if(isEmpty())
        {
            System.out.print("queue is empty");
            return-1;
        }
        int result=arr[front];

        /* single element condition if queue contain single contain */
        if(rear==front)
        rear = front =-1;

        else
        {
            front=(front+1)%size; /* front ko bhee increase karna hai */
        }

        return result;
    }
}
public class CirArrayImp{
      public static void main(String[] args) {

            Queue s=new Queue(4);
            s.Enqueu(24);
            s.Enqueu(89);
            s.Enqueu(67);
            s.Enqueu(23);
            s.Dequeu();
            s.Dequeu();
            s.Dequeu();
            s.Enqueu(77);
            System.out.println(s.Dequeu());
            System.out.println(s.Dequeu());
           
      }
}

