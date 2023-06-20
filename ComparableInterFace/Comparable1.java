// sort using Comparable interface.

import java.util.*;
class Student implements Comparable<Student> {
    int rollno;
    String name;
    int age;

    Student(int rollno, String name, int age) {
        this.rollno = rollno;
        this.name = name;
        this.age = age;
    }

    public int compareTo(Student st) {
        /*if (age == st.age)
            return 0;
        else if (age > st.age)
            return 1;
        else
            return -1;*/
        return Integer.compare(this.age, st.age); // we can replace above if, else with this line also.
    }
}

public class Comparable1 {
    public static void main(String args[]) {

        ArrayList<Student> al = new ArrayList<Student>();
        al.add(new Student(101, "Vijay", 23));
        al.add(new Student(106, "Ajay", 27));
        al.add(new Student(105, "Jai", 21));

        Collections.sort(al);   // sort using Comparable interace.
        
        for (Student st : al) {
            System.out.println(st.rollno + " " + st.name + " " + st.age);
        }

        // from here student2 class is sort using comparator
        System.out.println();
        ArrayList<Student2> al2 = new ArrayList<Student2>();
        al2.add(new Student2(50, "Vikky", 43));
        al2.add(new Student2(10, "Aman", 70));
        al2.add(new Student2(5, "Jai kishor", 55));

       Collections.sort(al2,new myCmp());   // sort using Comparator interace.
        
        for (Student2 st2 : al2) {
            System.out.println(st2.rollno + " " + st2.name + " " + st2.age);
        }
    }
}
// sort using Comparator or lamda sorting techinique.
// here we not invoke implements Comparable<Student2>
class Student2 {
    int rollno;
    String name;
    int age;

    Student2(int rollno, String name, int age) {
        this.rollno = rollno;
        this.name = name;
        this.age = age;
    }
}
class myCmp implements Comparator<Student2>{

    public int compare(Student2 p1, Student2 p2){
        return p1.rollno-p2.rollno;
    }
}
