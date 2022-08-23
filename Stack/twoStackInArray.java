/*
 *  implement two satck in an Array or eak array me do stack put karna.
 */
class twoStack {
    int[] arr;
    int capacity;
    int top1, top2;

    twoStack(int n) {
        capacity = n;
        top1 = -1;
        top2 = capacity;
        arr = new int[n];
    }

    void push1(int x) {
        if (top1 < top2 - 1) {
            top1++;
            arr[top1] = x;
        }
    }

    void push2(int x) {
        if (top1 < top2 - 1) {
            top2--;
            arr[top2] = x;
        }
    }
    int pop1()
    {
        if(top1>=0)
        {
            int res=arr[top1];
            top1--;
            return res;
        }
        else return 0;
    }
    int pop2()
    {
        if(top2<capacity)
        {
            int res=arr[top2];
            top2++;
            return res;
        }
        return 0;         /* we can also creat size function */
    }
}

public class stack6 {
    public static void main(String[] args) {

        twoStack s=new twoStack(4);

        s.push1(465);
        s.push2(45);
        s.push1(56);
        s.push2(42);

      

        System.out.println(s.pop1());
        System.out.println(s.pop1());
        System.out.println(s.pop2());
        

    }
}
