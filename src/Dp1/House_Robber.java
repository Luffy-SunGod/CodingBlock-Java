package Dp1;

import java.util.Arrays;

public class House_Robber {

	public static void main(String[] args) {
		int [] a= {3,2,3,5};
		int []dp=new int[a.length];
		Arrays.fill(dp,-1);
		System.out.println(robTd(a, 0, dp));
		System.out.println(rob(a, 0));
		}
	
	public static int rob(int [] a,int i) {//recursive approach
		if(i>=a.length)return 0;
		
		int dont_rob=rob(a, i+1);
		int do_rob=rob(a, i+2)+a[i];
		return Math.max(dont_rob, do_rob);
	}
	
	public static int robTd(int []a ,int i,int []dp) {
		if(i>=a.length)return 0;
		if(dp[i]!=-1)return dp[i];
		
		int dont_rob=robTd(a, i+1,dp);
		int do_rob=robTd(a, i+2,dp)+a[i];
		return dp[i]=Math.max(dont_rob, do_rob);
	}
	public static int robBu(int []a) {
		int []dp=new int[a.length];
		dp[0]=a[0];
		dp[1]=Math.max(a[0], a[1]);
		for(int i=2;i<a.length;i++) {
			int dont_rob=dp[i-1];
			int do_rob=dp[i-2]+a[i];
			
			dp[i]=Math.max(dont_rob, do_rob);
			
		}
		
		return dp[dp.length-1];
		
		
	}
	

}
