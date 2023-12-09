package lec27;

public class StackQueClient {
	public static void main(String[] args) throws Exception {
		StackUsingQue s=new StackUsingQue();
		s.push(1);
		s.push(199);
		s.push(188);
		s.push(18);
		s.push(178);
		s.push(167);
		s.push(16);
		s.push(15);
		s.push(14);
		s.push(13);
		s.print();
		for(int i=0;i<3;i++) {
		System.out.println(s.pop());
		}
		System.out.println("********");
		s.print();
		
		
	}

}
