package lec26;

public class QueObject {
	public static void main(String[] args) throws Exception {
		Que q=new Que();
		q.enque(1);
		q.enque(2);
		q.enque(3);
		q.enque(4);
//		for (int i = 0; i <=3; i++) {
//			q.deque();
//		}
		q.display();
	}
}
