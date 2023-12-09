package lectures;

import java.util.Arrays;



public class ArrayLinearSearchUsingRec {
	public static void main(String[] args) {
		int[] a= { 2, 3, 5, 7, 2, 7, 3, 2, 7, 2, 3 };
		int target=7;
		//search(a, 0, target);
		
		int [] ans=all_occ_2(a, 0, target, 0);
		System.out.println(Arrays.toString(ans));
		
		
	}
	
	public static int  search(int [] a,int i,int target) {
		if(i==a.length) {
			return -1 ;
		}
		
		if(a[i]==target) {  
			return i;
		}
		
		
		return search(a, i+1, target);
		//tail recursion
		
	}
	
	public static void  all_occ(int [] a,int i,int target) {
		if(i==a.length) {
			return ;
		}
		
		if(a[i]==target) {  
			System.out.println(i);
		}
		
		
		 search(a, i+1, target);
		//tail recursion
		
	}
	
	
	public static int[]  all_occ_2(int [] a,int i,int target,int count) {
		if(i==a.length) {	
			return new int [count];
		}
		
		if(a[i]==target) {
			int ans[]=all_occ_2(a, i+1, target, count+1);
			ans[count]=i;
			return ans;
			
		}else {
			return all_occ_2(a, i+1, target, count);
		}
	}
}  
