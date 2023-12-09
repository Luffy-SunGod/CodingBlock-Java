package lec25;

public class Student {
	String name="piyush";
	int age;
	
	
	public Student(String name,int age) {//parameterised constructor
			this.name=name;
			this.age=age;
	}
	
	public Student() {//default constructor
		
	}
	public void introduceypurself() {
		int rollno=23;// we cant ue this keyword in this
		System.out.println("my name is  "+name+" and age is"+age+"--"+rollno);//implicitly this use ho ra ha.
	}
	public void sayhey(String name) {
		System.out.println(name+" say hey  "+name);//global or local dono same h to hum explicitly this use krenge
	
		System.out.println(this.name+" say hey  "+name);
	}
	
}
