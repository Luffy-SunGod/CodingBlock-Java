package lec32rec;

import java.util.*;
public class Qreversse {
	public static void main(String[] args) {
		Queue<Integer> queue=new LinkedList<>();
		queue.add(1);
		queue.add(2);
		queue.add(3);
		queue.add(4);
		queue.add(5);
		System.out.println(queue);
		System.out.println("***************");
		reverse(queue);
		System.out.println(queue);
		
	}
	public static void reverse(Queue<Integer> q) {
		if(q.isEmpty())return ;
		int x=q.poll();
		reverse(q);
		q.add(x);
	}
}
