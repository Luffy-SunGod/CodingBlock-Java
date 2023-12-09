package lec28;

import java.util.Stack;

public class CelebrityProblem {

	public static void main(String[] args) {
	
		int [][] a={ {0, 0, 1, 0},
		           {0, 0, 1, 0},
		           {0, 0, 0, 0},
		           {0, 0, 1, 0} };
		
		System.out.println(findcelebrity(a));
		
	}
	
	public static int findcelebrity(int [][] a) {
		Stack<Integer> s=new Stack<>();
		for (int i = 0; i < a.length; i++) {
			s.push(i);
		}
		while(s.size()!=1) {
			int x=s.pop();
			int y=s.pop();
			if(a[x][y]==1) {
				s.push(y);
			}else {
				s.push(x);
			}
			
		}
		
		int candidate=s.pop();
		for (int i = 0; i < a.length; i++) {
			if(i!=candidate&&(a[i][candidate]==0||a[candidate][i]==1)) {
				return -1;
			}
		}
		return candidate;
	}
	
	
}
