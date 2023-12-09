package lec16;

public class FibonacciSeries {

	public static void main(String[] args) {
		int n=5;
		System.out.println(fibonaciseries(n));

	}
	
	public static int fibonaciseries(int n) {
		if(n==0||n==1) {
			return n;
		}
		
		int f1=fibonaciseries(n-1);
		int f2=fibonaciseries(n-2);
		
		return f1+f2;
	}

}
