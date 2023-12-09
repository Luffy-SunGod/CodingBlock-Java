package Dp1;

import java.util.Arrays;

public class Fib_Dp {
	public static void main(String[] args) {
		int n=5;
		int [] a=new int [n+1];
		System.out.println(fibTd(n, a));
		System.out.println(Arrays.toString(a));
		
	}
	//recursive fun
	public static int fib(int n) {
		if(n<2)return n;
		int f1=fib(n-1);
		int f2=fib(n-2);
		
		return f1+f2;
	}
	
	//Dp approach
	public static int fibTd(int n,int []dp) {
		if(n<2)return n;
		if(dp[n]!=0) return dp[n];//isse chlega dp
		int f1=fibTd(n-1, dp);
		int f2=fibTd(n-2, dp);
		return dp[n]=f1+f2;//ans yad kia hu
		
	}
	public static int fibBu(int n) {//iterative approach
		int []dp=new int [n+1];
		dp[0]=0;
		dp[1]=1;
		for (int i = 2; i <=n; i++) {
			dp[i]=dp[i-1]+dp[i-2];
		}
		return dp[n];
		
	}

}
