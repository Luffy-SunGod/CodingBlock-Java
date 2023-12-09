package lec41;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Set_Demo {
	public static void main(String[] args) {
		HashSet<String> set=new HashSet<>();
		set.add("Rahul");
		set.add("Ram");
		set.add("Ankit");
		set.add("Pooja");
		set.add("Shivam");
		set.add("Ankit");
		System.out.println(set);//random set
		
		TreeSet<String> set2=new TreeSet<>();
		set2.add("Rahul");
		set2.add("Ram");
		set2.add("Ankit");
		set2.add("Pooja");
		set2.add("Shivam");
		set2.add("Ankit");
		System.out.println(set2);//sorted form
		
		LinkedHashSet<String> set3=new LinkedHashSet<>();
		set3.add("Rahul");
		set3.add("Ram");
		set3.add("Ankit");
		set3.add("Pooja");
		set3.add("Shivam");
		set3.add("Ankit");
		System.out.println(set3);//insertion order preserve
		
		
		
	}

}
