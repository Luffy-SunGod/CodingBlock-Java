package lec26;

public class Que {
	protected int [] data;
	protected int front;
     private int size;
	public Que() {
		this.data=new int [5];
		this.front=0;
		this.size=0;
	}
	public Que(int cap) {
		this.data=new int [cap];
		this.front=0;
		this.size=0;
	}
	public void enque(int data) throws Exception {
		if(isfull()) {
			throw new Exception("que is empty");
		}
		int idx=(this.front+this.size)%this.data.length;
		this.data[idx]=data;
		size++;
	}
	public int deque() throws Exception {
		if(isempty()) {
			throw new Exception("Que is full");
		}
		int item=this.data[front];
		this.front=(this.front+1)%this.data.length;
		this.size--;
		return item;
	}
	public void display() {
		for (int i =0; i<size; i++) {
			int idx=(this.front+i)%this.data.length;
			System.out.print(this.data[idx]+"->");
		}
		System.out.println("end");
	}
	
	public int size() {
		return this.size;
	}
	public boolean isempty() {
		return this.size==0;
	}
	public boolean isfull() {
		return this.size==this.data.length;
	}
}