package lec26;

public class StackObject {
	public static void main(String[] args) throws Exception {
		Stack s=new Stack();
		
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.display();
	//	s.popAll();
		System.out.println("peak is->"+s.peek());
		System.out.println("size is->"+s.size());
		System.out.println("element poped out is->"+s.pop());
		s.display();
		System.out.println("size is->"+s.size());
		
		
		
	}

}
