package lectures;

public class Insertionasort {
	public static void main(String[] args) {
		int[] a= {5,4,3,2,1};
		Insertionsort(a);
		for (int i : a) {
			System.out.print(i+" ");
		}
		
	}
	
	public static void Insertionsort(int[] a) {
		for (int i = 1; i < a.length; i++) {
			int j=i-1;
			int element=a[i];
			while(j>=0&&a[j]>element) {
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=element;
		}
	}
}
