package lec20;

public class Partioning_String {

	public static void main(String[] args) {
		String s="nitin";
//	    partioning(s, "");
		partion(s, "");
		

	}
	
//	public static void partioning(String ques,String ans) {
//		
//		if(ques.length()==0) {
//			System.out.println(ans+" ");
//			return;
//		}
//		for (int i = 1; i <=ques.length(); i++) {
//			partioning(ques.substring(i), ans+ques.substring(0,i)+"/");
//		}
//	}
	 public static void partion(String s,String ans){
	        if(s.length()==0){
//	            System.out.println(ans);
	            return;
	        }
	        for (int i = 1; i <= s.length(); i++) {
	            String s1=s.substring(0 ,i);
	            String s2=s.substring(i);
	             System.out.println(s2);
	            partion(s2, ans+s1+"/");
	        }
	        
	        
	        
	    }
	

}
