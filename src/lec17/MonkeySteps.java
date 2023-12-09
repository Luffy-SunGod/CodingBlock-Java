package lec17;

public class MonkeySteps {
	public static void main(String[] args) {
		int n=4;
		System.out.println(steps(n, null, 0));
	}
	
	public static int  steps(int n,String ans,int sum) {
		
		if(sum==n) {
		 // System.out.println(ans);
		  return 1;
		}
		
		if(sum>n) {
			return 0;
		}
		int count=0;
		for(int i=1;i<=3;i++) {
		 count+= steps(n, ans+i, sum+i);
		}
		return count; 
		
		
		
	}

}
