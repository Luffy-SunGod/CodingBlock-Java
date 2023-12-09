package lec39;

import java.util.Comparator;

public class Cars_Client {
	public static void main(String[] args) {
		Cars car[]=new Cars[5];
		car[0]=new Cars(200,940,"red");
		car[1]=new Cars(250,140,"violet");
		car[2]=new Cars(260,220,"green");
		car[3]=new Cars(300,340,"white");
		car[4]=new Cars(500,345,"black");
		display(car);
		System.out.println("**********");
		bubblesort(car,new CarSpeedComprator());
		display(car);
		
	}
	
	public static <T> void display(T[] array ) {
		
		for (int i = array.length-1; i >=0; i--) {
			System.out.println(array[i]);
		}
		
	}
	
//	public static <T extends Comparable<T>>void bubblesort(T[] a) {
//		for (int i = 0; i < a.length; i++) {
//			for (int j = 0; j < a.length-i-1; j++) {
//				if(a[j].compareTo(a[j+1])>0) {
//					T temp=a[j];
//					a[j]=a[j+1];
//					a[j+1]=temp;
//				}
//			}
//		}
//	}
//	
	
	public static <T>void bubblesort(T[] a,Comparator<T> comp) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length-i-1; j++) {
				if(comp.compare(a[j], a[j+1])>0) {
					T temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
	}
	

}
