package lec30;
public class Merge2Ll {
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
	
	public void display() {
		Node tempNode=head;
		while(tempNode!=null) {
			System.out.println(tempNode.data+"->");
			tempNode=tempNode.next;
		}
		System.out.println("end");
	}
	public Node merge2list(Merge2Ll l1,Merge2Ll l2) {
		Node temp=new Node();
		Node ans=temp;
		while(l1!=null&&l2!=null) {
			if(l1.data<l2.data) {
				temp.next=l1;
				l1=l1.next;
				temp=temp.next;
			}else {
				temp.next=l2;
				l2=l2.next;
				temp=temp.next;
			}
		}
		if(l1!=null) {
			temp.next=l1;
			
		}if(l2!=null) {
			temp.next=l2;
		}
		ans=ans.next;
		return ans;
		
	}
	
	public static void main(String[] args) {
		Merge2Ll l1=new Merge2Ll();
		l1.addLast(1);
		l1.addLast(4);
		l1.addLast(6);
		l1.addLast(8);
		Merge2Ll l2=new Merge2Ll();
		l2.addLast(2);
		l2.addLast(5);
		l2.addLast(7);
		l2.addLast(3);
		
		Merge2Ll ans=new Merge2Ll();
		ans=ans.merge2list(l1, l2);
		  	
		
	}

}
