package lectures;

import sun.jvm.hotspot.runtime.StaticBaseConstructor;

//import com.sun.java.swing.ui.StatusBar;

public class Stringbuilder {

	public static void main(String[] args) {
//		StringBuilder s=new StringBuilder();
//		System.out.println(s.capacity());
//		System.out.println(s.length());
//		s.append("hellobye");
//		System.out.println(s.capacity());
//		System.out.println(s.length());
//		s.append("hellobyehyebye");
//		//size will increase by old*2+2;
//		System.out.println(s.capacity());
//		System.out.println(s.length());
//		//builder to string
//		String string=s.toString();
//		//String to builder,
//		String s1="hi";
//		StringBuilder sBuilder=new StringBuilder(s1);
		String_demo();
		
		
	}
	
	public static void String_demo() {
		StringBuilder stringBuilder=new StringBuilder();
		for (int i = 0; i < 10000; i++) {
			
			stringBuilder.append(i);
			
		}
		System.out.println(stringBuilder);
		
		
	}
	
	
	

}
