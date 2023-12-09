package lec31;
public class ReverseLinkedList {
	
	private class Node {
		int data;
		Node next;
	}

	private Node head;
	private int size;
	private Node tail;

	public void addFirst(int item) {
		Node nn = new Node();
		nn.data = item;
		if (this.size == 0) {
			this.head = nn;
			this.tail = nn;
			this.size++;
		} else {
			nn.next = this.head;	
			this.head = nn;
			this.size++;
		}

	}

	public void addLast(int item) {

		if (this.size == 0) {
			addFirst(item);
		} else {
			Node nn = new Node();
			nn.data = item;
			this.tail.next = nn;
			this.tail = nn;
			this.size++;
		}

	}
	private Node getNode(int k) throws Exception {

		if (k < 0 || k == this.size) {
			throw new Exception("k outof rage ka hai ");
		}
		Node temp = this.head;
		for (int i = 1; i <= k; i++) {
			temp = temp.next;
		}
		return temp;

	}
	public void Dispaly() {

		Node temp = this.head;
		while (temp != null) {
			System.out.print(temp.data + "-->");
			temp = temp.next;
		}
		System.out.println(".");
	}
	public void reverse_I() throws Exception {
		int i=0;
		int j=this.size-1;
	
		while(i<j) {
			Node left=getNode(i);
			Node right =getNode(j);
			int temp=left.data;
			left.data=right.data;
			right.data=left.data;
			i++;
			j--;
			
			
		}
	}
	public void rebverse_2_pointer() {
		Node previous=null;
		Node current=this.head;
		while(current!=null) {
			Node ahead =current.next;
			current.next=previous;
			previous=current;
			current=ahead;
		}
		Node temp=this.head;
		this.head=this.tail;
		this.tail=head;
		
	}
	public void reverse_pointer_recursively() {
		reverse_pointer_recursively(this.head, null);
		Node temp=this.head;
		this.head=this.tail;
		this.tail=head;
		
	}
	public void reverse_pointer_recursively(Node current,Node previous) {
		if(current==null)return;
		reverse_pointer_recursively(current.next, current);
		current.next=previous;
	}
	public void recursive_data(Node current,Node previous, int count) {
		if(current==null) {
			return;
		}
		if(count>this.size/2) {
			int t=current.data;
			current.data=previous.data;
			previous.data=t;
			previous=previous.next;
		}
		
	}
	public class HeapMover {
		Node left;

		public HeapMover(Node left) {
			// TODO Auto-generated constructor stub
			this.left = left;
		}

	}

	private void ReverseData_Recu(Node curr, HeapMover prev, int count) {
		if (curr == null) {
			return;
		}

		ReverseData_Recu(curr.next, prev, count + 1);
		if (count >= this.size / 2) {
			int t = curr.data;
			curr.data = prev.left.data;
			prev.left.data = t;
			prev.left = prev.left.next;
		}

	}

	
	
	public static void main(String[] args) throws Exception {
		ReverseLinkedList l=new ReverseLinkedList();
		l.addLast(1);
		l.addLast(2);
		l.addLast(3);
		l.addLast(4);
		l.addLast(5);
		l.Dispaly();
		//l.reverse_I();
		//l.rebverse_2_pointer();
	   l.Dispaly();
		
	}
}
