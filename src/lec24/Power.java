package lec24;

public class Power {
	public static void main(String[] args) {
		int k=2;
		int n=9;
		System.out.println(power(k, n));
		
	}
	public static int  power(int k,int n) {
		if(n==0) {
			return 1;
		}
		int ans=power(k, n/2);
		if(n%2==0) {
			return ans*ans;
		}
		else {
			return ans*ans*k;
		}
		
		
	}

}
