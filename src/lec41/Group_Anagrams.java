package lec41;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class Group_Anagrams {
	public static void main(String[] args) {
		String s[]= {"eat","tea","tan","ate","nat","bat"};
		List<String> list=new ArrayList<String>();
		
		
		
	}
	
	public static void groups(String[] str) {
		HashMap<String,List<String>> map=new HashMap<String, List<String>>();
		for (int i = 0; i < str.length; i++) {
			String s=str[i];
			int [] freq=new int[26];
			for (int j = 0; j < s.length(); j++) {
				freq[(s.charAt(i)-'a')]=1;
			}
			
			StringBuilder sb=new StringBuilder();
			for (int j = 0; j < freq.length; j++) {
				sb.append(freq[j]+" ")//space lgana jarurui h vrna same ho skta ha
				
			}
			String ss=sb.toString();
			if(!map.containsKey(ss)) {
				map.put(ss, new ArrayList<>());
			}else {
				map.get(ss).add(s);
			}
			List<List<String>> ll=new ArrayList<List<String>>();
//			for (List<String> list : ) {
//				
//			}
		}
	}
	

}
