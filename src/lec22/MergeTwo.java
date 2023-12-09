package lec22;

import java.util.Arrays;

public class MergeTwo {
public static void main(String[] args) {
	int [] a= {2,3,5,9,11,13};
	int[] b= {1,2,4,6,7};
	int [] c=new int[a.length+b.length];
	merge(a, b, c);
	System.out.println(Arrays.toString(c));
	
}
	public static void merge(int [] a,int[] b,int[] c) {
		int i=0;
		int j=0;
		int k=0;
		while(i<a.length&&j<b.length) {
			if(a[i]<b[j]) {
				c[k]=a[i];
				i++;
				k++;
			}
			else{
				c[k]=b[j];
				j++;
				k++;
			}
			
		}
		
		while(i<a.length) {
			c[k]=a[i];
			k++;
			i++;
		}
		while(j<b.length) {
			c[k]=b[j];
			k++;
			j++;
		}
	}
}
