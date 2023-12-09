package lec28;

import lec27.Dynamic_Queue;

public class QueueReverse {

	public static void main(String[] args) throws Exception {
		Dynamic_Queue dq=new Dynamic_Queue();
		dq.enque(10);
		dq.enque(20);
		dq.enque(30);
		dq.enque(40);
		dq.enque(50);
		dq.display();
		System.out.println("***********");
		reverse_que(dq);
		dq.display();
	}
	public static void reverse_que(Dynamic_Queue d) throws Exception {
		if(d.isempty()) {
			return;
		}
		int item=d.deque();
		reverse_que(d);
		d.enque(item);
	}

}
