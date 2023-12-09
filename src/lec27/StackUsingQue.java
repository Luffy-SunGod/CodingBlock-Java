package lec27;

public class StackUsingQue {
	Dynamic_Queue primary;
	Dynamic_Queue secondary;
	public StackUsingQue() {
		this.primary=new Dynamic_Queue();
		this.secondary=new Dynamic_Queue();
		}
	public void push(int data) throws Exception {
		primary.enque(data);
	}
	public int  pop() throws Exception {
		while(this.primary.size()>1) {
			
			this.secondary.enque(this.primary.deque());
		}
		int item=this.primary.deque();
		while(this.secondary.size()>0) {
			this.primary.enque(this.secondary.deque());
		}
		return item;
	}
	public int  peek() throws Exception {
		while(this.primary.size()>1) {
			
			this.secondary.enque(this.primary.deque());
		}
		int item=this.primary.deque();
		while(this.secondary.size()>0) {
			this.primary.enque(this.secondary.deque());
		}
		this.primary.enque(item);
		return item;
	}
	public void print() {
		this.primary.display();
	}
	
	public boolean isempty() {
		return this.primary.size()==0;
		
	}
	
	

}
