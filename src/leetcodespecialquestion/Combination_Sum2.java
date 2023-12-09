package leetcodespecialquestion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Combination_Sum2 {
	public static void main(String[] args) {
		
		int [] a= {2,5,2,1,2};
		int target=5;
		Arrays.sort(a);
		List<Integer> ans=new ArrayList<>();
		List<List<Integer>> list =new ArrayList<>();
		sum_combination2(a, target, 0,ans,list);
		System.out.println(list);
		
		
	}
	
	public static void sum_combination2(int [] a,int target,int indx,List<Integer> ans,List<List<Integer>> list) {//permutation
		if(target==0) {
			list.add(new ArrayList<>(ans));
			return;
		}
		for (int i = indx; i < a.length; i++) {
			if(i!=indx&&a[i-1]==a[i])continue;
			if(target>=a[i]) {
				ans.add(a[i]);
				sum_combination2(a, target-a[i],i+1,ans,list );
				ans.remove(ans.size()-1);
				
			}
		}
	}

}
