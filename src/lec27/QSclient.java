
package lec27;

public class QSclient {
	public static void main(String[] args) throws Exception {
      QueusingStack2 s=new QueusingStack2();
		s.enque(1);
		s.enque(1);
		s.enque(3);
		s.enque(4);
		s.enque(2);
		s.enque(2);
		s.display();
		System.out.println(s.deque());
		System.out.println(s.deque());
		s.enque(55);
		s.display();
	}

}
