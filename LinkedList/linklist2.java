/*linkedlist second method implemantation. */
class node
{
    int data;
    node next;
    node(int data)
    {
        this.data=data;
    }
}

public class linklist2 {
    public static void main(String[] args) {
        node first= new node(10);
         //puri node class ka reference/address first me aa gaya hai yani hum issae int data ka value bhee access kar sakte hai and node next ka bhee har sate hai.
        node second= new node(20);
        first.next=second; // jaise agar first.data=45 karte hai to data me 45 chala jayega and same first.next=second karte hai to first ke next me second ka address chala jayega.
        


        //yaha par int data me jo value hai vo change nahi hoga balki eak new heap me memory allocate hoga aur 20 store hoga aur uska reference/address second ke pass hoga yani hum second se int data ko bhee access kar sakte hai and node next ka bhee value acces kar kakte hai.
        node third= new node(30);
        second.next=third;

        node head=first; //first ka address head me dale hai yani hum head se int data ka value bhee access kar sakte hai and node next ka bhee value access kar sakte hai basically ye poori class ka address hai

        while(head!=null)
        {
            System.out.println(head.data);            
            System.out.println(head.next);            
            head=head.next; // head.next karne se jab first heap me jo next ka addrress hoga vo head me chal jayega yaha par head me second heap ka address chala jayega because niche hum first.next me second ka value dal diye hai. so head.next karne second kar addrss head me chala jayega.
        }
      
    }
}
