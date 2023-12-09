package lec25;

import java.util.Scanner;

public class Student_Client {

	public static void main(String[] args) {
		Student s=new Student();
		//Scanner sc=new Scanner(System.in);
		s.name="prashant";
		s.age=10; 
		Student s2=new Student();
		s2.name="kaju";
		s2.age=13;
		Student s4=new Student("karan", 20);
		System.out.println(s);//refernce variable h s to adress print ho jagea.
		System.out.println(s.name+"-->"+s.age);
		//Student s1=s;
		s.introduceypurself();
		s2.introduceypurself();
		s2.sayhey("ram");
		
		
	}

}
