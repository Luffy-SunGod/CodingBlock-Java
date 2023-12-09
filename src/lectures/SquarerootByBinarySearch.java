package lectures;

public class SquarerootByBinarySearch {

	public static void main(String[] args) {
		
		int n=64;
		System.out.println(Squareroot(n));
		

	}
	
	public static int  Squareroot(int n) {
		int answer=-1;
		int low=1;
		int high=n;
		while(low<=high) {
			int mid=(low+high)/2;
			if(mid*mid==n) {
				return mid;
			}
			
			else if(mid*mid>n) {
				high=mid-1;
			}
			else {
				answer=mid;
				low=mid+1;
				
			}
		}
		return answer;
	}

}
