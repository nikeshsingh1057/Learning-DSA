//printing pattern using function.

public class recursion13 {
    public static void main(String [] args)
    {
        printpattern(5, 0);
    }
    static void printpattern(int row,int cow)
    {
        if(row==0)
        return;
        if(cow<row){
        System.out.printf("*");
        printpattern(row, cow+1);}
        else 
        {
            System.out.println();
            printpattern(row-1, 0);
        }
    }
}

