package lectures;

import java.util.Scanner;

public class twodarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner b = new Scanner(System.in);
//	    int row=b.nextInt();
//	     int col=b.nextInt();
		
		int [][] a=new int[3][4];
//		System.out.println(a[0]);
//		System.out.println(a[1]);
//		System.out.println(a[2]);
		
		
		//user input in 2d Array
		for (int i = 0; i <a.length; i++) {
			for (int j = 0; j <a[0].length; j++) {
				System.out.println(".");
				a[row][col]=b.nextInt();
			}
		}
		
		//printing 2d array
		for (int i = 0; i < row; i++) {
			for (int j = 0; j <col; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

}
