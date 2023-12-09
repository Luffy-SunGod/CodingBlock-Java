package lectures;

public class Transpose_matrix {
	public static void main(String[] args) {
	  
		int [][] a = {{1,2,3},{4,5,6},{7,8,9}};
		   //before transpose
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("**************");
		//after transpose;
		 
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				//System.out.println(".");
				int temp=a[i][j];
				a[i][j]=a[j][i];
				a[j][i]=temp;
			}
		}
		
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
	}
	

}
