package lectures;

//brute force aprroach of kadanes algorithm


public class MAximumSubarray {

	public static void main(String[] args) {
		
		int[] a= {-3,4,2,-7,8};
		System.out.println(Max_subarry(a));
		System.out.println(opt_bruteforce(a));

	
	}
	
	public static int Max_subarry(int[] a) {
		int answer=Integer.MIN_VALUE;
		for (int i = 0; i < a.length; i++) {
			for (int j = i; j < a.length; j++) {
				int sum=0;
				for (int k = i; k <=j; k++) {
					sum+=a[k];
				}
				answer=Math.max(answer,sum);
				
			}
			
		}
		
		return answer;
		
	}
	
	
	
	public static int opt_bruteforce(int[] a) {
		int answer=Integer.MIN_VALUE;
		
		
		
		for (int i = 0; i < a.length; i++) {
			int sum=0;
			for (int j = i; j < a.length; j++) {
				sum+=a[j];
				answer=Math.max(answer, sum);
				
			}
		}
		
		return answer;
		
	}

}
