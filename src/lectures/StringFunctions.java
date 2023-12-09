package lectures;

public class StringFunctions {
	
	public static void main(String[] args) {
		String string="hellobye";
		System.out.println(string);
		System.out.println(string.substring(0,8));
		//System.out.println(string.substring(4,1));
		string=string.substring(1);
		System.out.println(string);
		System.out.println(string.startsWith("hell"));
		System.out.println(string.endsWith("bye"));

		
		
	}

}
