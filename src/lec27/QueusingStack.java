package lec27;

public class QueusingStack {
	private Dynamic_Stack input;
	private Dynamic_Stack output;
	public QueusingStack() {
		input=new Dynamic_Stack();
		output=new Dynamic_Stack();
	}
	
	public void enque(int data) throws Exception {
		this.input.push(data);
	}
	
	public int deque() throws Exception {
		if(this.output.size()>0) {
			return this.output.peek();
		}
		else {
			while(this.input.size()>0) {
				this.output.push(this.input.pop());
			}
		}
		return this.output.pop();
		
	}
	
	public int peek() throws Exception {
		if(this.output.size()>0) {
			return this.output.peek();
		}
		else {
			while(this.input.size()>0) {
				this.output.push(this.input.pop());
			}
		}
		return this.output.peek();
		
	}
	
	public void diaplay() throws Exception {
		
			while(this.input.size()>0) {
				this.output.push(this.input.pop());
			}
			while(this.output.size()>0) {
				this.input.push(this.output.pop());
			}
			this.input.display();
		}

}
