package leetcodespecialquestion;

import java.util.ArrayList;
import java.util.List;

public class Combination {
	
	public static void main(String[] args) {
		int n=4;
		int k=2;
		boolean[] board=new boolean[n];
		List<Integer> ans=new ArrayList<>();
		List<List<Integer>> list=new ArrayList<>();
		combination(board, n, k, 0, 0, ans, list);
		System.out.println(list);
	}
	
	public static void combination(boolean[] board ,int n,int k,int c,int indx,List<Integer> ans,List<List<Integer>> list) {
		if(c==k) {
			list.add(new ArrayList<>(ans));
			return;
		}
		for (int i = indx; i <board.length; i++) {
			if(board[i]==false) {
				board[i]=true;
				ans.add(i+1);
				combination(board, n, k, c+1,i+1,ans,list);
				ans.remove(ans.size()-1);
				board[i]=false;
					
			}
		}
	}

}
