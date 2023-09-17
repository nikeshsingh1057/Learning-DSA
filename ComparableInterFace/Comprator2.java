// Comparator and comprable working on Student Object class.
package Oops;
import java.util.*;

class Student implements Comparable<Student>{
	
	String name;
	int id;
	int roll;
	
	Student(int id,String name,int roll) {
		
		this.id=id;
		this.name=name;
		this.roll=roll;	
	}
	// The toString() method returns the String representation of the object.
	// to String method object ko print karwane ke kamm me aata hai isko override kiye hai hai ye java ke lang package me rahat hai.
	
	public String toString() {
		return this.name+"=>"+this.roll;
	}
	
	@Override
	public int compareTo(Student o) {
		return this.roll-o.roll;
	}
	
}
class Main{
	public static void main(String[] args) {
		
		List<Student> ll=new ArrayList<>();
		ll.add(new Student(23, "aman", 3));
		ll.add(new Student(9, "nikesh", 50));
		ll.add(new Student(2, "vikash", 74));
		ll.add(new Student(7, "Rishbh", 59));
		ll.add(new Student(81, "Ayushi", 17));
		ll.add(new Student(46, "kunal Jadon",42));
		
		Collections.sort(ll);     // [aman=>3, Ayushi=>17, kunal Jadon=>42, nikesh=>50, Rishbh=>59, vikash=>74] 
		
		Collections.sort(ll,new IdComparator()); //[vikash=>74, Rishbh=>59, nikesh=>50, kunal Jadon=>42, Ayushi=>17, aman=>3]
		System.out.println(ll);
	}
}

// comparator ke liye alag se class manana padta hai aur uss class ka object pass karna padta hai.
// lekin comparable ke liye alag se class nahi banana hota hai.
class IdComparator implements Comparator<Student>{
	
	public  int compare(Student o1, Student o2) {
		return o2.roll-o1.roll;
	}
}
// if i use this IdComparator we get output as given below
// [vikash=>74, Rishbh=>59, nikesh=>50, kunal Jadon=>42, Ayushi=>17, aman=>3]
