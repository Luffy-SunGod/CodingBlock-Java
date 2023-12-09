package leetcodespecialquestion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Combination_sum {
	public static void main(String[] args) {
		int [] a= {2,5,2,1,2};
		int target=5;
		Arrays.sort(a);
		List<Integer> ans=new ArrayList<>();
		List<List<Integer>> list =new ArrayList<>();
		sum_combination(a, target, 0,ans,list);
		System.out.println(list);
		
	}
	public static void sum(int [] a,int target,String ans) {//permutation
		if(target==0) {
			System.out.println(ans);
			return;
		}
		for (int i = 0; i < a.length; i++) {
		
			if(target>=a[i]) {
				sum(a, target-a[i], ans+a[i]);
			}
		}
	}
	public static void sum_combination(int [] a,int target,int indx,List<Integer> ans,List<List<Integer>> list) {//permutation
		if(target==0) {
			list.add(new ArrayList<>(ans));
			return;
		}
		for (int i = indx; i < a.length; i++) {
			if(i<a.length-1&&a[i]==a[i]+1)continue;
			if(target>=a[i]) {
				ans.add(a[i]);
				sum_combination(a, target-a[i],i,ans,list );
				ans.remove(ans.size()-1);
				
			}
		}
	}
	
	
	

}
