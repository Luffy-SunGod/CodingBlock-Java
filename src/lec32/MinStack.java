package lec32;

import java.util.Stack;

public class MinStack {
	
	private Stack<Integer> s=new Stack<>();
	private int min;
	
	public void push(int data) {
		if(s.empty()) {
			s.push(data);
			this.min=data;
		}
		else if(data>=min) {
			this.s.push(data);
		}else {
			
			int item=2*data-min;
			this.s.push(item);
			this.min=data;
			
		}
	}
	public int pop() {
		if(s.peek()>=this.min) {
			return s.pop();
		}
		else {
			int val = s.pop();
			int od_item = this.min;
			this.min=2*od_item-val;
			return od_item;
		}
	
	}
	public int peek() throws Exception {
		if (s.isEmpty()) {
			throw new Exception("pgl h??");
		}
		
		if(s.peek()>=this.min) {
			return s.peek();
		}
		else {
			int od_item = this.min;
			return od_item;
		}
	
	}
	public int min() {
		return this.min;
	}
	public static void main(String[] args) {
		MinStack ms=new MinStack();
		ms.push(5);
		ms.push(7);
		ms.push(2);
		ms.push(9);
		ms.push(4);
		ms.push(3);
		ms.push(8);
		ms.push(1);
		ms.push(17);
		System.out.println(ms.min());
		System.out.println(ms.pop());
		System.out.println(ms.pop());
		System.out.println(ms.pop());
		System.out.println(ms.min());
	}
}
