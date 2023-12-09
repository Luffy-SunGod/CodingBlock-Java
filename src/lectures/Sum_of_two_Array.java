package lectures;

import java.util.ArrayList;

public class Sum_of_two_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] a= {1,0,2,9};
		int []  b= {3,4,5,9,6};
		ArrayList<Integer> list=new ArrayList<Integer>();
		
		
		
		 int carry=0; 
		 int i=a.length-1;
		 int j=b.length-1;
		 
		while(i>=0||j>=0) {
			int sum=0;
			
			if(i>=0) {
				sum+=a[i];
				i--;
			}
			if(j>=0) {
				sum+=b[j]; 
				j--;
			}
			sum+=carry;
			list.add(0,sum%10);
			carry=sum/10;
			
	}
		
		if(carry==1) {
			list.add(0,carry);
		}
		
		 
		System.out.println(list);
		
		

	}

}
