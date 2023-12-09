package lectures;

import java.util.Arrays;

public class NextPrmutation {

	public static void main(String[] args) {

		int[] a= {7,6,2,4,7,6,4};
		next_permutation(a);
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		
		
	}
	public static void next_permutation(int[] a) {
		int p=-1;
		for (int i = a.length-2; i>=0; i--) {
			if(a[i]<a[i+1]) {
				p=i;
				break;
			}
			
		}
		
		int q=-1;
		for (int i = p+1; i>p; i--) {
			
			if(a[i]>a[p]) {
				q=i;
				
				break;
			}
			
		}
		
		int temp=a[p];
		a[p]=a[q];
		a[q]=temp;
		 reverese(a, p+1, a.length-1);
	}
	
	
	public static void reverese(int [] a,int i,int j) {
		
		    while(i<=j) {
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			i++;
			j--;
			
		}
	}
}
