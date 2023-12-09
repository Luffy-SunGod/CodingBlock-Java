package lec27;

import lec26.Que;

public class Dynamic_Queue extends Que{
		
	@Override
		public void enque(int data) throws Exception {
		
		if(super.isfull()) {
			int[] newarray=new int [2*this.data.length];
			for (int i = 0; i < this.data.length; i++) {
				int idx = (this.front + i) % this.data.length;
				newarray[i]=this.data[idx];
			}
			this.data=newarray ;
			this.front=0;
			
			
		}
		super.enque(data);
		
	}
	

}
