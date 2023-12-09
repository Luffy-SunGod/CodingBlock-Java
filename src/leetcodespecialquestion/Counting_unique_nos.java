package leetcodespecialquestion;

public class Counting_unique_nos {
	
	public static void main(String[] args) {
		int n=3;
		System.out.println(uniquecount(n));
		
		
	}
	
	public static int uniquecount(int n) {
		if(n==0) {
			return 1;
		}
		int digit_count=9;
		for (int i = 2; i <=n ; i++) {
			digit_count=(11-i)*digit_count;
		}
		
		return digit_count+=uniquecount(n-1);
		
	}

}
