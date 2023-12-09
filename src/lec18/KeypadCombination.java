package lec18;

public class KeypadCombination {
	static String[] keys= {"","abc","def","ghi","jkl","mno","pqr","stu","vwx","yz"};

	public static void main(String[] args) {
		String s="12";
		keys_pressed(s, "");

	}
	
	public static void keys_pressed(String s,String ans) {
		if(s.length()==0) {
			System.out.println(ans);
			return;
		}
		char ch=s.charAt(0);
		String pressed=keys[ch-48];// 1-0=1
		for (int i = 0; i < pressed.length(); i++) {
			 
			keys_pressed(s.substring(1), ans+pressed.charAt(i));
		}
	}

}
