package lec16;

public class Subsequence {

	public static void main(String[] args) {
		subSequence("abc", "");

	}
	
	public static void subSequence(String ques,String ans) {
		
		
		if(ques.length()==0) {
			System.out.println(ans);
			return;
		}
		char ch=ques.charAt(0);
		subSequence(ques.substring(1), ans);
		subSequence(ques.substring(1), ans+ch);
		
		
	}

}
