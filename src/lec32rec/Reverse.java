package lec32rec;
import java.util.*;
public class Reverse {
	public static void main(String[] args) {
		Stack<Integer> s=new Stack<>();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
		s.push(6);
		s.push(7);
		s.push(8);
		System.out.println("satck before reverse");
		System.out.println(s);
		reverse(s);
		System.out.println("stack after reverse");
		System.out.println(s);
	}
	public static void reverse(Stack<Integer> s) {
		if(s.isEmpty())return ;
		int x=s.pop();
		reverse(s);
		insertbottom(s,x);
	 }
	public static void insertbottom(Stack<Integer> s,int x) {
		if(s.isEmpty()) {
			s.push(x);
			return;
		}
		int item=s.pop();
		insertbottom(s, x);
		s.push(item);
	}
}
