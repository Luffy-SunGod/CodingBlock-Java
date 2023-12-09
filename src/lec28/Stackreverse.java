package lec28;

import java.util.Stack;

public class Stackreverse {
	public static void main(String[] args) {
		Stack<Integer> s=new Stack<>();
	     s.push(10);
	     s.push(20);
	     s.push(30);
	     s.push(40);
	     s.push(50);
	     System.out.println(s);
	     System.out.println("**************");
	     reversestack(s);
	     System.out.println(s);
		
	}
	public static void reversestack(Stack<Integer> s) {
		if(s.empty()) {
			return;
		}
		int i=s.pop();
		reversestack(s);
		insert_bottom(s, i);
		
		
	}
	public static void insert_bottom(Stack<Integer> s,int i) {
		if(s.empty()) {
			s.push(i);
			return;
		}
		int item=s.pop();
		insert_bottom(s, i);
		s.push(item);
	}

}
