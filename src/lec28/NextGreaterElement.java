 package lec28;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {

	public static void main(String[] args) {
		int [] a= {11,8,13,21,3};
		int ans[]=next(a);
		System.out.println(Arrays.toString(ans));
		
		
	}
	public static int[] next(int []a ) {
		Stack<Integer> s=new Stack<>();
		int ans[]=new int[a.length];
		for (int i = 0; i < a.length; i++) {
			while(!s.isEmpty()&&a[i]>a[s.peek()]) {
				ans[s.pop()]=a[i];
				
			}
			s.push(i);
		}
		while(!s.isEmpty()) {
			ans[s.pop()]=-1;
		}
		return ans;
		
	}
}
