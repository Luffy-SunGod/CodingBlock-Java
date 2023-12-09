package lectures;

import java.util.Scanner;

public class GoodSub_String {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		System.out.println(GoodSs(s));
		
	
		

		
	}
	
	public static int GoodSs(String s) {
		int count=0;
		
		int ans=0;
		for(int i=0;i<s.length();i++) {
			char a=s.charAt(i);
			if(is_it_vowel(a)) {
				count++;
				ans=Math.max(ans, count);
			}else {
				count=0;
			}
		}
		return ans;
	}

	public static boolean is_it_vowel(char a) {
		if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u')	{
			return true;
			
		}
		
		
		
		return false;
	}

}
