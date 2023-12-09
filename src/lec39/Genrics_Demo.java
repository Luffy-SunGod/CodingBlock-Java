package lec39;

public class Genrics_Demo {
	
	public static void main(String[] args) {
		Integer [] a= {1,2,3,4,5};
		display(a);
		String[] b= {"aksnl","ldlknc","eknc"};
		display(b);
		
		
		
	}
	public static<T> void display(T[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}

}
