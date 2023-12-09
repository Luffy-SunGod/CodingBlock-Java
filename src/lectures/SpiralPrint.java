package lectures;

import java.util.Iterator;

public class SpiralPrint {

	public static void main(String[] args) {
		int [][] a= {
				
				{11 ,12, 13, 14},
				{21 ,22 ,23 ,24},
				{31 ,32 ,33, 34},
				{41 ,42 ,43 ,44}, {17,18,19,20}
		};
		
		SpiralPrint_print(a,a.length,a[0].length);
		System.out.println();
		System.out.println("*********");
		
		
		
		
		
		

	}
	
	
	public static void SpiralPrint_print(int [][] arr,int m,int n) {
		int count = 0;
		int minc = 0;
		int minr = 0;
		int maxc = arr[0].length - 1;
		int maxr = arr.length - 1;
		int total_element=arr.length * arr[0].length;
			
		while (count < total_element) {
			for (int i = minc; i <= maxc && count < total_element; i++) {
				System.out.print(arr[minr][i] + " ");
				count++;

			}
			minr++;
			for (int i = minr; i <= maxr && count < total_element; i++) {
				System.out.print(arr[i][maxc] + " ");
				count++;
			}
			maxc--;
			for (int i = maxc; i >= minc && count < total_element; i--) {
				System.out.print(arr[maxr][i] + " ");
				count++;
			}
			maxr--;
			for (int i = maxr; i >= minr && count < total_element; i--) {
				System.out.print(arr[i][minc] + " ");
				count++;
			}
			minc++;
		}
	}
//	{11 ,12, 13, 14},
//	{21 ,22 ,23 ,24},
//	{31 ,32 ,33, 34},
//	{41 ,42 ,43 ,44}
	
	   public static void spiral2(int [][] arr) {
		int count = 0;
		int minc = 0;
		int minr = 0;
		int maxc = arr[0].length - 1;
		int maxr = arr.length - 1;
		int total_element=arr.length * arr[0].length;
		
		while(count<total_element) {
			for (int i =minr ; i <=maxr&&count<total_element ; i++) {
				System.out.print(arr[i][minc]+" ");
				count++;
			}
			
			minc++;
			for (int i = minc; i <=maxc&&count<total_element; i++) {
				System.out.print( arr[maxr][i]+" ");
				count++;
				
			}
			maxr--;
			for (int i =maxr; i >=minr&&count<total_element ; i--) {
				System.out.print(arr[i][maxc]+" ");
				count++;
				
			}
			maxc--;
			
			for (int i = maxc; i >= minc&&count<total_element; i--) {
				System.out.print(arr[minr][i]+" ");
				count++;
			}
			
			minr++;
		}
		
		
		
	}

}
