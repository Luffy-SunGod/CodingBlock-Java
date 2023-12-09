package lec27;

public class QueusingStack2 {
	
	private Dynamic_Stack primary;
	private Dynamic_Stack secondary;
	public QueusingStack2() {
		primary=new Dynamic_Stack();
		secondary=new Dynamic_Stack();
	}
	
	public void enque(int data) throws Exception {
		this.primary.push(data);
	}
	public int deque() throws Exception {
		
		while(this.primary.size()>0) {
			this.secondary.push(this.primary.pop());
			
		}
		int item=this.secondary.peek();
		
		while(this.secondary.size()>0) {
			this.primary.push(this.secondary.pop());
			
		}
		return item;
	}
	
	public void display() {
		this.primary.display();
	}

}
