package lectures;

public class Lec15Recursion {

	public static void main(String[] args) {
			int n=5;
			System.out.println(factoril(n));
			//print(n);
			//print_increment(n);
			System.out.println(factorial2(n, 1));
			System.out.println(power(4,4 ));
			System.out.println(power2(4, 4, 1));

	}
	public static int factoril(int n) {
	
		if(n==0||n==1) {
			return 1;
		}
		int f=factoril(n-1);
		
			return n*f;//head recursion 
			
		
	}
	
	public static int factorial2(int n,int ans) {
		// tail recursion.
		if(n==0||n==1) {
			return ans;
		}
		
		return factorial2(n-1, ans*n);
	}
	
	
	public static void print(int n) {
		if(n==0) {
			return;
		}
		
		System.out.println(n);
		print(n-1);//tail recurion.
	
	}
	public static void print_increment(int n) {
		if(n==0)return;
		print_increment(n-1);//head recursion;
		
		System.out.println(n);
	}
	
	public static int power(int n,int p) {
		if(p==0) {
			return 1;
		}
		
		return n*power(n, p-1); //head recursion
	}
	public static int power2(int n,int p,int ans) {
		//tail recursion.
		if(p==0) {
			return ans;
		}
		
		return power2(n, p-1,ans*n); //head recursion
	}
	
	

}
