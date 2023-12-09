package lec41;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.TreeMap;

import javax.naming.PartialResultException;

public class HashMap_Demo {
	public static void main(String[] args) {
		HashMap<String, Integer> map=new HashMap<>();
		map.put("Rahul", 80);
		map.put("Aniket", 79);
		map.put("pooja",58);
		map.put(null, 45);
		//System.out.println(map.get("pooja"));
		map.put("pooja", 100);
		//System.out.println(map.get("pooja"));
	   // System.out.println(map);
		System.out.println(map.values());
//		map.remove("Rahul");
//		System.out.println(map);
	    
//	    Set<String> set=map.keySet();// Part 1
//	    System.out.println(set);
//	    for(String s: set) {
//	    	System.out.println(s+" " +map.get(s));
//	    }
//	    System.out.println("****************");
//	    
//	    ArrayList<String>  list=new ArrayList<>(map.keySet());// Part 2
//	    System.out.println(list);
//	    for(String s:list) {
//	    	System.out.println(s+" ->"+map.get(s));
//	    }
//	    System.out.println("####################");
//	    
//	   //Part 3
//	    for(String s:map.keySet()) {
//	    	System.out.println(s+"---> "+map.get(s));
//	    	
//	    }
//	    
//	    
		
		
		//get
		//System.out.println(map.get("Rahul"));
		//System.out.println();
		
//		TreeMap<String, Integer> map1=new TreeMap<>();
//		map1.put("Rahul", 80);
//		map1.put("Aniket", 79);
//		map1.put("pooja",58);
//		
//		System.out.println(map1);
//		
//		LinkedHashMap<String, Integer> map2=new LinkedHashMap<>();
//		map2.put("Rahul", 80);
//		map2.put("Aniket", 79);
//		map2.put("pooja",58);
//		map2.put("piyush",100);
//		System.out.println(map2);
	
		
	}

}
