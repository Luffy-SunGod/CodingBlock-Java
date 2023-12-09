package lec17;

public class ConsecutiveHeads {

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
		if(ans.length()==0||ans.charAt(ans.length()-1)!='H')
		probabilty(n-1, ans+"H");
		
		
	}

}
