package lec27;

public class DynamicQueClient {

	public static void main(String[] args) throws Exception {
		Dynamic_Queue d=new Dynamic_Queue();
		d.enque(1);
		d.enque(12);
		d.enque(13);
		d.enque(14);
		d.enque(13);
		d.enque(15);
		d.enque(16);
		d.enque(17);
		d.enque(18);
		d.enque(144);
		d.enque(167);
		d.enque(19);
		d.enque(199);
		d.enque(167);
		d.enque(1654);
		d.display();
	}
}
