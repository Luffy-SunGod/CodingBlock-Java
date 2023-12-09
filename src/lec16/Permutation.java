package lec16;

public class Permutation {
	public static void main(String[] args) {
		String string="2130";
		permutaion(string, "");
	}
	public static void permutaion(String s,String ans) {
		if(s.length()==3&& Integer.parseInt(ans)%2==0) {
			System.out.println(ans);
			return;
		}
		
		
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			String s1=s.substring(0,i);
			String s2=s.substring(i+1,s.length());
			
			permutaion(s1+s2, ans+c);
		}
		
		
	}

}
