package lectures;

public class RotateArray {

	public static void main(String[] args) {
        int[] arr= {1,2,3,4,5,6,7};
	    int k=3;
	   // System.out.println(arr.length);
	    rotatearray(arr, k);
	    for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"  ");
		}	    
	}

	public static void rotatearray(int[] a,int k) {
		int n=a.length;
		
		k=k%n;
		reversearray(a, 0,a.length-1 );
		reversearray(a, 0, k-1);
		reversearray(a, k, a.length-1);
	
		
	}
	
	public static void reversearray(int[] a,int i,int j) {
		while(i<j) {
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
		i++;
		j--;
		}
		}
	

}
