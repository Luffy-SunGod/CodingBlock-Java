package lec35;

import java.util.ArrayList;
import java.util.List;

public class PathSum2 {
	
	public class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode() {}
		      TreeNode(int val) { this.val = val; }
		      TreeNode(int val, TreeNode left, TreeNode right) {
		          this.val = val;
		          this.left = left;
		          this.right = right;
		      }
		  }
	
	class Solution {
	    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
	    	List<List<Integer>> list=new ArrayList<>();
	    	List<Integer> ans=new ArrayList<>();
	    	path(root, targetSum, list, ans);
	    	return list;
	    	
	   }
	    
	    public void path(TreeNode root,int target,List<List<Integer>> list,List<Integer> ans) {
	    	if(root==null) {
	    		return;
	    	}
	    	if(root.left==null&&root.right==null&&target-root.val==0) {
	    		ans.add(root.val);
	    		list.add(new ArrayList<>(ans));
	    		ans.remove(ans.size()-1);
	    		return;
	    	}
	    	
	    	ans.add(root.val);
	    	path(root.left, target-root.val, list, ans);
	    	path(root.right, target-root.val, list, ans);
	    	ans.remove(ans.size()-1);
	    	
	    }
	    	
	  }

}
