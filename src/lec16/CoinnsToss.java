package lec16;

public class CoinnsToss {

	public static void main(String[] args) {
		int n=3;
		probabilty(n, "");
		

	}
	
	
	public static void probabilty(int n,String ans) {
		if(n==0) {
			
			System.out.println(ans);
			return;
		}
		
		probabilty(n-1, ans+"T");
		probabilty(n-1, ans+"H");
		
		
		
		
	}

}
