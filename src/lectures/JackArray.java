package lectures;

import java.util.Scanner;

public class JackArray {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		int[][] a=new int[4][];
		for (int i = 0; i < a.length; i++) {
			int c=s.nextInt();
			for (int j = 0; j < c; j++) {
				a[i][j]=s.nextInt();
			}
		}
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j <a[i].length; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		

	}

}
