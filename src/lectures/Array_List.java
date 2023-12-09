package lectures;

import java.util.*;


public class Array_List {

	public static void main(String[] args) {
			
		ArrayList<Integer> list=new ArrayList<>();
		System.out.println(list);
		list.add(1);
		list.add(2);
		System.out.println(list);
		System.out.println(list.size());
		//add at index
		
		list.add(1, 34);//replace ni krta h ye
		System.out.println(list);
		list.add(list.size(), 90);
		System.out.println(list);
		list.set(1, 0);
		System.out.println(list);
		
		Collections.sort(list);
		
		System.out.println(list);
		
		
		
	}

}
