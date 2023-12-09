
package lectures;

import java.util.ArrayList;
import java.util.Scanner;

public class Array_list_two {
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		ArrayList<Integer> list =new ArrayList<>();
		int n=scanner.nextInt();
		for (int i = 0; i < n; i++) {
			int item=scanner.nextInt();
			list.add(item);
			//or list.add(scanner.nextInt());
		}
		
		
	}

}
