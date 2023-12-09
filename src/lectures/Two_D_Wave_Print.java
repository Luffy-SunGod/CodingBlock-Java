package lectures;

public class Two_D_Wave_Print {

	public static void main(String[] args) {
		int[][] a= {{11,12,13,14},{21,22,23,24},{31,32,33,34},{41,42,43,44}};
		print(a);

	}
	  
	
	public static void print(int [][] a) {
		
		
		for (int col= 0; col < a.length;col++) {
			
		if(col%2==0) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i][col]+" ");
		}
		
		}
		
		else {
		for (int i =a.length-1; i >=0; i--) {
			System.out.print(a[i][col]+" ");
			
		}
		}
		}
		
	}
}
