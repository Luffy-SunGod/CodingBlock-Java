package lec32rec;

import java.util.*;

public class MinStack {
	  private Stack<Integer> s;
	  int min;
	  public MinStack() {
		  s=new Stack<>();
		  min=Integer.MAX_VALUE;
	  }
	  
	  public void push(int x) {
		  min=Math.min(x, min);
		  s.push(x);
	  }
	  
}
