package lectures;

public class String_All_Subarray {
	
	public static void main(String[] args) {
		String s="naman";
		for(int i=0;i<s.length();i++) {
			for (int j =i+1; j<=s.length(); j++) {
				if(pallidrone_or_not(s.substring(i,j))) {
				System.out.print(s.substring(i,j)+" ");}
			}
			System.out.println();
		}
		
//		System.out.println("**************");
//		for(int i=0;i<=s.length();i++) {
//			for (int j =s.length(); j>i; j--) {
//				System.out.print(s.substring(i,j)+" ");
//			}
//		}
		
		
	}
	
	public static  boolean pallidrone_or_not(String s) {
		int i=0;
		int j=s.length()-1;
		while(i<=j) {
			if(s.charAt(i)!=s.charAt(j)) {
				return false;
			}else {
			i++;
			j--;
			}
		}
		
		return true ;
	}

}
