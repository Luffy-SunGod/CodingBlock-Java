package lectures;

public class Product_of_Array_Except_Self {

	public static void main(String[] args) {
		
		int[] a= {1,2,3,4};
		for (int i : a) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		int[] answer=opt_product(a);
		for (int i : answer) {
			System.out.print(i+" ");
		}
		

	}
	
	public static int[] product_except_itself(int[] a) {
		int[] left=new int[a.length];
		left[0]=1;
		for (int i = 1; i < left.length; i++) {
			left[i]=left[i-1]*a[i-1];
			}
		
		int[] right=new int[a.length];
		right[a.length-1]=1;
		for (int i=right.length-2; i>=0; i--) {
			right[i]=right[i+1]*a[i+1];
		}
		
		for(int i=0;i<a.length;i++) {
			a[i]=left[i]*right[i];
		}
		
		
		return a;
		
	}
	
	
	public static int[] opt_product(int[] a) {
		int[] answer=new int[a.length];

		int[] left=new int[a.length];
		left[0]=1;
		for (int i = 1; i < left.length; i++) {
			left[i]=left[i-1]*a[i-1];
			}
		int r=1;
		for (int i = left.length-1 ;i>=0; i--) {
			
		   answer[i]=left[i]*r;
		   r*=a[i];
			
		}
		
		return answer;

		
		
		
	}

}
