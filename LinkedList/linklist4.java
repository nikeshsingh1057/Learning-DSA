
// add element in begning of linkedlist 
// isme hum  node class outside banaye hai and (static head) banaye hai.
/*
 * agar hum static mehod banate hai to class ka object banane ka jarurat nahi hai yani vo direct 
 * function ke name se call ho jata hai. magar agar method/function public rahata "(public node insert())"
 * to function ko call karane ke liye class ka object banana padata hai.
 */
class node {

    int data;
    node next;

    node(int x) {

        data = x;
        next = null;
    }

}

public class linklist4 {

    static node head;

    static void insert(int x) {

        node newNode = new node(x);
        if (head != null) {

            newNode.next = head;
        }
        head = newNode;
    }

    static void display(node head) {

        while (head != null) {
            System.out.println(head.data);
            head = head.next;
        }

    }

    public static void main(String[] args) {

        insert(10);
        insert(20);
        insert(30);

        display(head);
    }
}
