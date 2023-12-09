package lec29Linkedlist;

public class LinkedListClient {

	public static void main(String[] args) throws Exception {
		LinkedList l=new LinkedList();
		l.addLast(1);
		l.addLast(2);
		l.addLast(3);
		l.addLast(4);
		l.addLast(5);
		l.Dispaly();
		System.out.println(l.removeFirst());
		System.out.println(l.removeLAst());
		l.Dispaly();
		
		
	
	}
}
