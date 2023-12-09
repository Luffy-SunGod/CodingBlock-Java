package lec23;

import java.util.Arrays;

public class QuickSort {
	public static void main(String[] args) {
		int[] a= {5,2,4,1,9,11,3};//pivot index kisis ko bhi mann skte h last wala ya first or mid

	//	System.out.println(pivot_index(a, 0, a.length-1));
		Quicksort(a, 0, a.length-1);
		System.out.println(Arrays.toString(a));
	}
	public static void Quicksort(int[] a,int si,int ei) {
		if(si>ei)return;
		int pi=pivot_index(a, si, ei);
		Quicksort(a, si, pi-1);
		Quicksort(a, pi+1, ei);
		
	}
	public static int pivot_index(int[] a,int si,int ei) {
		int pivot=a[ei];
		int pi=si;
		for (int i = si; i<=ei-1; i++) {
			if(a[i]<=pivot) {
				int t=a[pi];
				a[pi]=a[i];
				a[i]=t;
				pi++;
			}
			
			
		}
		
		int t=a[pi];
		a[pi]=a[ei];
		a[ei]=t;
		return pi;
	}

}
