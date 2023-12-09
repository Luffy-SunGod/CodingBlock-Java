package lec28;

import java.util.Arrays;
import java.util.Stack;

public class StockSpam {
	
	public static void main(String[] args) {
		int[] a= {7,10,12,4,15,8,9};
		spam(a);
		
	}
	
	public static void spam(int[] a) {
		Stack<Integer> s=new Stack<>();
		int [] ans=new int[a.length];
		for(int i=0;i<a.length;i++) {
		while(!s.isEmpty()&&a[i]>a[s.peek()]) {
			s.pop();
		}
		if(s.isEmpty()) {
			ans[i]=i+1;
			
		}
		else {
			ans[i]=i-s.peek();
		}
		s.push(i);
		
		
	}
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(ans));
		
	}
	

}
