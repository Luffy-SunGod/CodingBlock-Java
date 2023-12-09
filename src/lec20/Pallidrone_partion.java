package lec20;

public class Pallidrone_partion {
	public static void main(String[] args) {
		String s="nitin";
		pallidrone_partioning(s,"");
		
		
		
	}
public static void pallidrone_partioning(String ques,String ans) {
		
		if(ques.length()==0) {
			System.out.println(ans+" ");
			return;
		}
		for (int i = 1; i <=ques.length(); i++) {
			if(is_pallidrone(ques.substring(0,i)) )
			pallidrone_partioning(ques.substring(i), ans+ques.substring(0,i)+"/");
		}
	}
	public static boolean is_pallidrone(String s) {
		if(s.length()==1) {
			return true;
		}
		int i=0;
		int j=s.length()-1;
		while(i<j) {
			if(s.charAt(i)!=s.charAt(j))return false;
			i++;
			j--;
		}
	return true;
	
	}


}
