package lec27;

import lec26.Stack;

public class Dynamic_Stack extends Stack {
	
	@Override
	public void push(int item) throws Exception {
		
		if(super.isfull()) {
			int[] newarray=new int[this.data.length*2];
			
			for (int i = 0; i < this.data.length; i++) {
				newarray[i]=this.data[i];
			}
			
			this.data=newarray ;
			
		}
		
		super.push(item);
	}
	

}
