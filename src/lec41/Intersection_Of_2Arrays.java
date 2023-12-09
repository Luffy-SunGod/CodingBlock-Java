package lec41;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Intersection_Of_2Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a= {1,2,3,4,1,3,1,3,4};
		int [] b= {2,1,3,1,4,1,11,4,5,1,4,5,22};
		System.out.println(Arrays.toString(intersect(a, b)));

	}
	
	public static int[] intersect(int [] a,int []b) {
		HashMap<Integer, Integer> map=new HashMap<>();
		for (int i = 0; i < a.length; i++) {
			if(map.containsKey(a[i])==true) {
				map.put(a[i], map.get(a[i])+1);
			}else {
				map.put(a[i],1);
				
			}
			
		}
		ArrayList<Integer> list=new ArrayList<>();
		for (int i = 0; i < b.length; i++) {
			if(map.containsKey(b[i])&&map.get(b[i])>0) {
				list.add(b[i]);
				map.put(b[i], map.get(b[i])-1);
			}
			
		}
		
	   int [] ans=new int[list.size()];
	   for (int i = 0; i < ans.length; i++) {
		ans[i]=list.get(i);
	}
	   return ans;
	}
	

}
