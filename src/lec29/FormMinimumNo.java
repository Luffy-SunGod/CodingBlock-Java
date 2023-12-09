package lec29;


import java.util.Scanner;
import java.util.Stack;

public class FormMinimumNo {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		while(n-->0) {
			String str=s.next();
			fromminimum(str);
			
			
		}
	}
	public static void fromminimum(String str) {
		Stack<Integer> s=new Stack<>();
		for (int i = 0; i <=str.length(); i++) {
			s.push(i+1);
			if(i==str.length()||str.charAt(i)=='I') {
				while(!s.empty()) {
					System.out.print(s.pop());
				}
			}
		}
		System.out.println();
	}

}
