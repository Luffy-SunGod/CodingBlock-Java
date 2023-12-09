package Dp1;

public class Climb_Stairs {

	public static void main(String[] args) {
		int n=5;
		

	}
	public static int noofwaysrec(int n) {
		if(n==0||n==1) {
			return 1;
		}
		int s1=noofwaysrec(n-1);
		int s2=noofwaysrec(n-2);
		return s1+s2;//tle dega
	}
	public static int noofways(int n,int []dp) {
		if(n==0||n==1) {
			return 1;
		}
		if(dp[n]!=0)return dp[n];
		int s1=noofwaysrec(n-1);
		int s2=noofwaysrec(n-2);
		return dp[n]=s1+s2;//tle dega
	}

	public static int noofwaysBu(int n) {
		int []dp=new int[n+1];
		dp[0]=1;
		dp[1]=1;
		for(int i=2;i<=n;i++) {
			dp[i]=dp[i-1]+dp[i-2];
		}
		return dp[n];
		
	}

}
