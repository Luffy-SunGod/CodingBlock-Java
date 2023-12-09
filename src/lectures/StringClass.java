package lectures;

public class StringClass {
	public static void main(String[] args) {
		String s="hello";
		String s1="world";
		System.out.println(s.length());
		for (int i = 0; i < s.length(); i++) {
		
			System.out.println(s.charAt(i));
			
		}
		//concatenate two string
		System.out.println(s.concat(s1));
		System.out.println(s+s1);
		
		
		
		
		
	}
	

}
