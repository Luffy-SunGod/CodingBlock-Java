package lectures;

import java.util.Scanner;

public class RainWaterHarvesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a= {4,2,0,3,2,5};
		
		System.out.println(trap(a));
		

	}
	
	public static int trap(int[] a) {
		
		int n=a.length;
		int [] answer=new int[n];
		int[] left=new int[n];
		int[] right=new int[n];
		
		left[0]=a[0];
		for (int i = 1; i < right.length; i++) {
			left[i]=Math.max(left[i-1],a[i]);
			
		}
		
		right[n-1]=a[n-1];
		for (int i = n-2; i >=0; i--) {
			right[i]=Math.max(right[i+1], a[i]);
		}
		
		for (int i = 0; i < right.length; i++) {
		     answer[i]=Math.min(left[i], right[i])-a[i];
		     
		}
		
		int sum=0;
		for (int i = 0; i < right.length; i++) {
			sum+=answer[i];
			
		}
		
		return sum;
	}

}
