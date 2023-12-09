		package lec26;

public class Stack {
	protected int [] data;
	protected int top;
	public Stack() {
       this.data=new int [5];
       this.top=-1;
	}
	
	public void push(int x) throws Exception {
		if(isfull()) {
			throw new Exception("stack is full element cant be add");
		}
		this.top++;
		this.data[this.top]=x;
	}
	
	public int pop() throws Exception {
		if(isempty()) {
			throw new Exception("stack is empty element cant be poped out");
		}
		int element=this.data[top];
		this.top--;
		return element;
	}
	
	public int size() {
		return this.top+1;
	}
	public int peek() throws Exception {
		if(isempty()) {
			throw new Exception("stack is empty no peek elemnt");
			
		}
		return this.data[this.top];
	}
	
	public void popAll() throws Exception {
		for (int i = top; i>=0; i--) {
			System.out.println(this.pop());
			
		}
	}
	
	public void display() {
		for (int i =0; i<=top; i++) {
			System.out.print(this.data[i]+"->");
		}
		System.out.println("end");
		
	}
	public boolean isempty() {
		return this.top==-1;
	}
	public boolean isfull() {
		return this.top==data.length-1;
	}
	
}
