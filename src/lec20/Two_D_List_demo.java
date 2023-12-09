package lec20;

import java.util.*;

public class Two_D_List_demo {
	public static void main(String[] args) {
		String s="nitin";
		List<String> ans=new ArrayList<>();
		List<List<String>> list=new ArrayList<>();
		pallidrone_partioning(s,ans,list);
		System.out.println(list);
	}
public static void pallidrone_partioning(String ques,List<String> ans,List<List<String>> list) {
		
		if(ques.length()==0) {
			list.add(new ArrayList<>(ans));
			return;
		}
		for (int i = 1; i <=ques.length(); i++) {
			String ros=ques.substring(0,i);
			if(is_pallidrone(ros)){
				ans.add(ros);
			pallidrone_partioning(ques.substring(i),ans,list );
			
			}
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
