package lec31;

public class Client_recur_reverse {
	public static void main(String[] args) {
		ReverseLinkedList l=new ReverseLinkedList();
		l.addLast(1);
		l.addLast(2);
		l.addLast(3);
		l.addLast(4);
		l.addLast(5);
		l.Dispaly();
		l.reverse_pointer_recursively();
		l.Dispaly();
	}

}
