package leetcodespecialquestion;
import java.util.ArrayList;
import java.util.List;

public class Genrateparenthesis {
	public static void main(String[] args) {
		String exp="2*3-4*5";
		List<Integer> ans=expression(exp);
		System.out.println(ans);
		
	}
	
	public static List<Integer> expression(String s) {
		
		if(s.indexOf('+')==-1&&s.indexOf('*')==-1&&s.indexOf('-')==-1) {
			List<Integer> bs=new ArrayList<>();
			bs.add(Integer.parseInt(s));
			return bs;
	}
		
		
		
		List<Integer> ans=new ArrayList<>();
		for (int i = 0; i <s.length(); i++) {
			if(s.charAt(i)=='+'||s.charAt(i)=='*'||s.charAt(i)=='-') {
				List<Integer> left= expression(s.substring(0,i));
				List<Integer> right=expression(s.substring(i+1));
			
			
			if(s.charAt(i)=='+') {
				for ( int val :left) {
					for (int val1 : right) {
						ans.add(val+val1);
					}
				}
			}
			if(s.charAt(i)=='-') {
				for ( int val :left) {
					for (int val1 : right) {
						ans.add(val-val1);
					}
				}
			}
			if(s.charAt(i)=='*') {
				for ( int val :left) {
					for (int val1 : right) {
						ans.add(val*val1);
					}
				}
			}
			
		}
	}
		return ans;
	}

}
