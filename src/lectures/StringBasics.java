package lectures;

public class StringBasics {

	public static void main(String[] args) {
		String s1="hello";
		String s2="hello";
		String s3=new String("hi");
		String s4=new String("hi");
		
		System.out.println(s1==s2);
		System.out.println(s3==s4);
		// equal to operator adress compare krata h class me.
		
		System.out.println(s1.equals(s2));
		System.out.println(s3.equals(s4));
		//.equals data compare krta ha.
		
		
		//string +integer=string.
		
	 System.out.println(s1+10+20+"bye");
	 System.out.println(s1+(10+20)+"bye");

	 
	}

}
